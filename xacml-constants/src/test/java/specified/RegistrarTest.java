package specified;

import org.junit.Assert;
import org.junit.Test;

import java.util.Map;

public class RegistrarTest {

  @Test
  public void testFrom() throws Exception {
    Map<Class<Enum<?>>, Map<String, Enum>> tokens = Registrar.tokens;
    XacmlFunctionProto from =
        XacmlFunctionProto.from("urn:oasis:names:tc:xacml:3.0:function:access-permitted");
    Assert
        .assertEquals(
            from,
            XacmlFunctionProto.urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__access_$2D_permitted);
  }
}