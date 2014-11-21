package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlDeprecated{
       urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath$2Dnode$2Dcount,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath$2Dnode$2Dequal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath$2Dnode$2Dmatch,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Afunction$3Auri$2Dstring$2Dconcatenate,
      http$3A$2F$2Fwww$2Ew3$2Eorg$2FTR$2F2002$2FWD$2Dxquery$2Doperators$2D20020816$23dayTimeDuration,
      http$3A$2F$2Fwww$2Ew3$2Eorg$2FTR$2F2002$2FWD$2Dxquery$2Doperators$2D20020816$23yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dequal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dequal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime$2Dadd$2DdayTimeDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime$2Dadd$2DyearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime$2Dsubtract$2DdayTimeDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime$2Dsubtract$2DyearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Adate$2Dadd$2DyearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Adate$2Dsubtract$2DyearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Adeny$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy$2Dcombining$2Dalgorithm$3Apermit$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Ddeny$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy$2Dcombining$2Dalgorithm$3Aordered$2Dpermit$2Doverrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dintersection,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dat$2Dleast$2Done$2Dmember$2Dof,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dunion,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dsubset,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dset$2Dequals,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dintersection,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dat$2Dleast$2Done$2Dmember$2Dof,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dunion,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dsubset,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dset$2Dequals,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Done$2Dand$2Donly,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dbag$2Dsize,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dis$2Din,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration$2Dbag,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Done$2Dand$2Donly,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dbag$2Dsize,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dis$2Din,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration$2Dbag,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aany$2Dof,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aall$2Dof,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aany$2Dof$2Dany,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Amap,
;

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  public static class Registry {
    public static final Map<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}
