package xcaml.pdp;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.RequestType;
import org.apache.camel.builder.RouteBuilder;
import specified.XacmlEvaluation;

public class PdpRouteBuilder extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from("direct:evaluate")
            .routeId("evaluatePdpRequest")
            .doTry()
                .process(exchange -> {
                    RequestType request = exchange.getIn().getBody(RequestType.class);
                    PolicyType policy = exchange.getIn().getHeader("policy", PolicyType.class);

                    PdpTx pdpTx = new PdpTx(policy);
                    XacmlEvaluation resolution = pdpTx.evaluateRequest(request);

                    exchange.getIn().setBody(resolution);
                })
                .to("mock:result")
            .doCatch(Exception.class)
                .to("mock:deadLetterChannel")
            .end();
    }
}
