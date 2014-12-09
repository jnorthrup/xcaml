package specified;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class Xacml3Test {

  @Test
  public void testFrom() throws Exception {
    Map<Class<Enum<?>>, Map<String, Enum>> tokens = Xacml3.tokens;
    XacmlFunction from =
        XacmlFunction.from("urn:oasis:names:tc:xacml:3.0:function:access-permitted");
    Assert
        .assertEquals(
            from,
            XacmlFunction.urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__access_$2D_permitted);
  }
}