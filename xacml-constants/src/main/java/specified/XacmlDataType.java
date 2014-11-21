package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

/**
 * todo: link through {@link javax.xml.datatype.DatatypeFactory
}
 */public
enum XacmlDataType  {
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__integer,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__double,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__time,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__date,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__dateTime,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__dayTimeDuration,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__yearMonthDuration,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__anyURI,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__hexBinary,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__base64Binary,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata_$2D_type$3A__rfc822Name,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata_$2D_type$3A__x500Name,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Adata_$2D_type$3A__xpathExpression,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata_$2D_type$3A__ipAddress,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata_$2D_type$3A__dnsName,
;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}

