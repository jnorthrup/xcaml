import com.sun.jndi.toolkit.url.Uri
import oasis.names.tc.xacml._3_0.core.schema.wd_17.AttributeDesignatorType
import oasis.names.tc.xacml._3_0.core.schema.wd_17.MatchType
import org.apache.camel.Handler
import specified.XacmlFunctionProto

import javax.management.Attribute

/**
 * Created by jim on 1/19/15.
 */
class Pdp {
}



class Evaluator{
    @Handler createMatcher(MatchType matchType){
        def id = matchType.matchId
        matchType.attributeDesignator
        
    }
    
}