package xcaml.pdp;

import oasis.names.tc.xacml._3_0.core.schema.wd_17.AttributesType;
import oasis.names.tc.xacml._3_0.core.schema.wd_17.RequestType;

/**
 * Created by jim on 4/2/15.
 */
public class RequestTupleUtil {
    public static <T> T lookup(RequestType rt, String... tuple) {

        for (AttributesType attributesType : rt.getAttributes()) {
            if ((attributesType.getCategory() == tuple[0]) && (attributesType.getId() == tuple[1])) {
                return (T) rt.getAttributes().iterator().next().getContent();

            }
        }
        return null;
    }
}
