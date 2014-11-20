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
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23string,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23boolean,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23integer,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23double,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23time,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23date,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23dateTime,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23dayTimeDuration,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23yearMonthDuration,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23anyURI,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23hexBinary,
  http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23base64Binary,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata$2Dtype$3Arfc822Name,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata$2Dtype$3Ax500Name,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Adata$2Dtype$3AxpathExpression,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata$2Dtype$3AipAddress,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Adata$2Dtype$3AdnsName,
;

  public final String token = URLDecoder.decode(name().replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}

/**
 * The following XML attributes have values that are URIs.  These may be extended by the creation of new URIs associated with new semantics for these attributes.

 */
enum XacmlExtensibilityPoints{
Category,
AttributeId,
DataType,
FunctionId,
MatchId,
ObligationId,
AdviceId,
PolicyCombiningAlgId,
RuleCombiningAlgId,
StatusCode,
SubjectCategory

}