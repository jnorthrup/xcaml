package specified;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by jim on 11/20/14.
 */
public class ElementsTest {

  @Test
  public void testRegistryTokens() {
    for (XacmlElements z : XacmlElements.values()) {
      String token = z.token;
      assertEquals(z, XacmlElements.Registry.tokens.get(token));
    }
  }
}
