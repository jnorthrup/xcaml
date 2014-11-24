package xcaml;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.ObjectFactory;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.TargetType;
import org.apache.camel.EndpointInject;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.mock.MockEndpoint;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.apache.camel.test.junit4.CamelTestSupport;
import org.junit.Test;

public class JaxbDataFormatMultipleNamespacesTest extends CamelTestSupport {

    @EndpointInject(uri = "mock:marshall")
    private MockEndpoint mockMarshall;

    @EndpointInject(uri = "mock:unmarshall")
    private MockEndpoint mockUnmarshall;

    /*@Test
    public void testMarshallMultipleNamespaces() throws Exception {
        mockMarshall.expectedMessageCount(1);
PolicyType order = new PolicyType();
*//*        Order order = new Order();
        order.setId("1");
        Address address = new Address();
        address.setStreet("Main Street");
        address.setStreetNumber("3a");
        address.setZip("65843");
        address.setCity("Sulzbach");
        order.setAddress(address);*//*
        template.sendBody("direct:marshall", order);

        assertMockEndpointsSatisfied();

        String payload = mockMarshall.getExchanges().get(0).getIn().getBody(String.class);
        log.info(payload);

        assertTrue(payload.startsWith("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>"));
        assertTrue(payload.contains("<order:order"));
        assertTrue(payload.contains("<order:id>1</order:id>"));
        assertTrue(payload.contains("<address:address>"));
        assertTrue(payload.contains("<address:street>Main Street</address:street>"));
        assertTrue(payload.contains("<address:streetNumber>3a</address:streetNumber>"));
        assertTrue(payload.contains("<address:zip>65843</address:zip>"));
        assertTrue(payload.contains("<address:city>Sulzbach</address:city>"));
        assertTrue(payload.contains("</address:address>"));
        assertTrue(payload.contains("</order:order>"));

        // the namespaces
        assertTrue(payload.contains("xmlns:address=\"http://www.camel.apache.org/jaxb/example/address/1\""));
        assertTrue(payload.contains("xmlns:order=\"http://www.camel.apache.org/jaxb/example/order/1\""));
    }
*/
    @Test
    public void testUnarshallMultipleNamespaces() throws Exception {
        mockUnmarshall.expectedMessageCount(1);

        String payload = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?><ns1:order xmlns:ns2=\"http://www.camel.apache.org/jaxb/example/address/1\""
                + " xmlns:ns1=\"http://www.camel.apache.org/jaxb/example/order/1\"><ns1:id>1</ns1:id><ns2:address><ns2:street>Main Street</ns2:street>"
                + "<ns2:streetNumber>3a</ns2:streetNumber><ns2:zip>65843</ns2:zip><ns2:city>Sulzbach</ns2:city></ns2:address></ns1:order>";
        template.sendBody("direct:unmarshall", payload);

        assertMockEndpointsSatisfied();

        PolicyType   order = (PolicyType) mockUnmarshall.getExchanges().get(0).getIn().getBody();
        TargetType target = order.getTarget();
//        Address address = order.getAddress();
//        assertEquals("1", order.getId());
//        assertEquals("Main Street", address.getStreet());
//        assertEquals("3a", address.getStreetNumber());
//        assertEquals("65843", address.getZip());
//        assertEquals("Sulzbach", address.getCity());
    }

    @Override
    protected RouteBuilder createRouteBuilder() throws Exception {
        return new RouteBuilder() {
            @Override
            public void configure() throws Exception {
                 JaxbDataFormat jaxbDataFormat =   new JaxbDataFormat(){{
                    setContextPath(ObjectFactory.class.getPackage().getName());
                    setFragment(Boolean.TRUE);
                    setPartClass(PolicyType.class.getCanonicalName());
                }};

                from("direct:marshall")
                        .marshal(jaxbDataFormat)
                        .to("mock:marshall");

                from("direct:unmarshall")
                        .unmarshal(jaxbDataFormat)
                        .to("mock:unmarshall");
            }
        };
    }
}
