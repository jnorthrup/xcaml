package xcaml.pdp;

import com.google.auto.factory.Provided;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.AnyOfType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicySetType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.PolicyType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.TargetType;
import org.apache.camel.*;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.component.direct.DirectConsumer;
import org.apache.camel.component.direct.DirectEndpoint;
import org.apache.camel.impl.DefaultCamelContext;
import org.apache.camel.model.ModelCamelContext;
import org.apache.camel.util.CollectionHelper;

import javax.xml.ws.Endpoint;

/**
 * <ul>
 * <li>map a policyType XML declaration as a Context to start/stop and route requests to.
 * <li>map a TargetType XML Declaration as a Route.
 * <li>map a RuleType XML declaration to a Context or Component, unsure at this time.
 * <li>map sequences of AnyOf XML declaration to a series of predicates joined with OR.
 * <li>map sequences AllOf XML declaration to a series of predicates joined with AND.
 * <li>figure out how to fashion a blackboard system of variable state scoping and reference for
 * Variable*,Attribute*,etc. elements
 * <li>design route abstractions to accommodate Apply,Function,Expression,ObligationExpression,etc. elements
 */
class Pdp {

  @Handler
  public void runPolicySet(@Body PolicySetType initPolicySet) {

    // /TargetType something something something

  }

  class Expression {

  }

}