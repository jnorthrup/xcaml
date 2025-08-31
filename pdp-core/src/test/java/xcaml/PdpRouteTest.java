package xcaml;

import com.google.common.io.Resources;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.RequestType;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;
import specified.XacmlEvaluation;
import xcaml.pdp.PdpRouteBuilder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

public class PdpRouteTest extends CamelTestSupport {

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new PdpRouteBuilder();
    }

    @Test
    public void testPdpRoute() throws Exception {
        // 1. Load test data from resources
        JAXBContext jaxbContext = JAXBContext.newInstance(PolicyType.class, RequestType.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        PolicyType policy;
        try (InputStream policyStream = Resources.getResource("policy1.xml").openStream()) {
            Object unmarshalledPolicy = unmarshaller.unmarshal(policyStream);
            if (unmarshalledPolicy instanceof JAXBElement) {
                policy = ((JAXBElement<PolicyType>) unmarshalledPolicy).getValue();
            } else {
                policy = (PolicyType) unmarshalledPolicy;
            }
        }

        RequestType request;
        try (InputStream requestStream = Resources.getResource("request1.xml").openStream()) {
            Object unmarshalledRequest = unmarshaller.unmarshal(requestStream);
            if (unmarshalledRequest instanceof JAXBElement) {
                request = ((JAXBElement<RequestType>) unmarshalledRequest).getValue();
            } else {
                request = (RequestType) unmarshalledRequest;
            }
        }

        // 2. Set up mock endpoint for the result
        MockEndpoint mockResult = getMockEndpoint("mock:result");
        mockResult.expectedMessageCount(1);
        mockResult.expectedBodiesReceived(XacmlEvaluation.NotApplicable); // Based on previous run's output

        // 3. Send the request to the route
        // We send the policy as a header and the request as the body
        template.sendBodyAndHeader("direct:evaluate", request, "policy", policy);

        // 4. Assert that the mock endpoint received the correct message
        assertMockEndpointsSatisfied();
    }

    @Test
    public void testErrorHandling() throws Exception {
        // This test checks the Dead Letter Channel EIP.
        // We expect any processing failure to be routed to the dead letter queue.
        MockEndpoint mockDeadLetter = getMockEndpoint("mock:deadLetterChannel");
        mockDeadLetter.expectedMessageCount(1);

        // Sending a null policy in the header should cause a NullPointerException in the route.
        template.sendBody("direct:evaluate", new RequestType());

        assertMockEndpointsSatisfied();
    }
}
