# Project Refactoring: TDD Plan for Camel Enterprise Integration

This document outlines a plan to refactor the XACML policy engine to use standard Apache Camel Enterprise Integration Patterns (EIPs), reducing custom "invention debt" and improving maintainability and scalability. Each step will be driven by a test case (Red -> Green).

---

### 1. Refactor Policy Evaluation to a Camel Route

*   **Goal**: Replace the manual `evaluateRequest` logic in `PdpTx.java` with a proper Camel route. This will be the main "enterprise build out" and will serve as the foundation for other improvements.
*   **The "Red" Test**:
    1.  Create a new test class, `PdpRouteTest.java`, that extends `CamelTestSupport`.
    2.  This test will send a `RequestType` object (loaded from `request1.xml`) to a `direct:evaluate` endpoint.
    3.  It will assert that the correct `XacmlEvaluation` result (`NotApplicable` in this case) is produced on a mock output endpoint.
    4.  This test will fail to compile initially, as the `direct:evaluate` route will not exist.
*   **The "Green" Implementation**:
    1.  Create a new `PdpRouteBuilder.java` class.
    2.  Define a route that starts from `direct:evaluate`.
    3.  The route will use Camel's **Content-Based Router** EIP to replace the manual `policyIndex` lookup logic. The router will inspect the incoming request's attributes.
    4.  The route will use Camel's **Bean Binding** feature to call the appropriate function in `XacmlFunctionProto`, replacing the manual dispatch and making the code much cleaner.
    5.  The results of the rule evaluations will be collected using the **Aggregator** EIP.
    6.  The Aggregator will use a custom `AggregationStrategy` that encapsulates the logic from the existing `XacmlCombiningAlgorithm`.
    7.  The final, combined result will be sent to the mock endpoint, causing the test to pass.

### 2. Implement a Dead-Letter Channel for Error Handling

*   **Goal**: Add robust, enterprise-grade error handling to the policy evaluation route using Camel's Dead-Letter Channel (DLC) EIP.
*   **The "Red" Test**:
    1.  Add a new test to `PdpRouteTest.java`.
    2.  This test will send a malformed or problematic request to the `direct:evaluate` endpoint (e.g., one that would cause a `NullPointerException` or another runtime error in the current implementation).
    3.  It will assert that the original message is automatically routed to a `mock:deadLetterChannel` endpoint.
    4.  This test will fail because no error handling is in place, and the route will just throw an exception.
*   **The "Green" Implementation**:
    1.  In `PdpRouteBuilder.java`, configure a Dead-Letter Channel on the main evaluation route.
    2.  The DLC will be configured to catch any exceptions, log the error details, and redirect the original, failed message to the `mock:deadLetterChannel` endpoint for analysis, making the test pass.

---
