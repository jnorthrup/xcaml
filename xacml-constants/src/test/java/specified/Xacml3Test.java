package specified;

import org.junit.Assert;
import org.junit.Test;

public class Xacml3Test {

  @Test
  public void testFrom() throws Exception {
    XacmlFunction from =
        XacmlFunction.from("urn:oasis:names:tc:xacml:3.0:function:access-permitted");
    Assert.assertEquals(from,
        XacmlFunction.urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Afunction$3A__access_$2D_permitted);
  }
}