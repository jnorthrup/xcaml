package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlCombiningAlgorithms {
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule$2Dcombining$2Dalgorithm$3Afirst$2Dapplicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Afirst$2Dapplicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Aonly$2Done$2Dapplicable,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Adeny$2Dunless$2Dpermit,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule$2Dcombining$2Dalgorithm$3Apermit$2Dunless$2Ddeny,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Adeny$2Dunless$2Dpermit,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Apermit$2Dunless$2Ddeny,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,;
  ;
  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum<XacmlCombiningAlgorithms>> tokens = new LinkedHashMap<String, Enum<XacmlCombiningAlgorithms>>();

    static {
      asList(values()).stream().forEach(f -> tokens.put(f.token, f));
    }
  }

}

