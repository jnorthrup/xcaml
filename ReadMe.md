
## Xacml Camel project. ##

this project aims to adapt Camel DSEL semantics to the XACML 3.0 JAXP object model 

#### todo: ####

- [x] map a policyType XML declaration as a Context to start/stop and route requests to.
- [x] map a TargetType XML Declaration as a Route.
- [ ] map a RuleType XML declaration to a Context or Component, unsure at this time.
- [x] map sequences of AnyOf XML declaration to a series of predicates joined with OR (in policyviz).
- [x] map sequences AllOf XML declaration to a series of predicates joined with AND (in policyviz).
- [x] fashion a blackboard system of variable state scoping with spring-util map
- [ ] design route abstractions to accommodate Apply,Function,Expression,ObligationExpression,etc. elements
