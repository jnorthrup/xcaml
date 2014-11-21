package specified;


import java.net.URLDecoder;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import static java.util.Arrays.asList;

/**
 * urlencoded urn's to conform to java symbol names. cannot be shortened without some version number guessing.
 * no point, java uses hash lookups for switch/enum things.
 */
public enum XacmlFunction implements F {
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dequal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dequal$2Dignore$2Dcase {
    @Override
    public Boolean apply(Object... strings) {
      return asList(strings).parallelStream().map(String::valueOf).map(String::toLowerCase).distinct().limit(2).count() == 1;
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dequal {
    @Override
    public Object apply(Object[] objects) {
      return asList(objects).parallelStream().map(String::valueOf).map(Base64.getDecoder()::decode).distinct().limit(2).count() == 1;
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dadd {
    @Override
    public Object apply(Object[] objects) {
      AtomicInteger r = new AtomicInteger(0);
      asList(objects).forEach(o -> r.getAndAdd((Integer) o));
      return r.get();
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dadd,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dsubtract,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dsubtract,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dmultiply,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dmultiply,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Ddivide,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Ddivide,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dmod,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dabs,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dabs,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58round,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58floor,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dnormalize$2Dspace,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dnormalize$2Dto$2Dlower$2Dcase,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dto$2Dinteger,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dto$2Ddouble,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58or,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58and,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58n$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58not,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dateTime$2Dadd$2DdayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dateTime$2Dadd$2DyearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dateTime$2Dsubtract$2DdayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dateTime$2Dsubtract$2DyearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58date$2Dadd$2DyearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58date$2Dsubtract$2DyearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58time$2Din$2Drange,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dgreater$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dgreater$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dless$2Dthan,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dless$2Dthan$2Dor$2Dequal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dbag,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dbag,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dbag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dis$2Din,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dbag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58ipAddress$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58ipAddress$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58ipAddress$2Dbag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58dnsName$2Done$2Dand$2Donly,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58dnsName$2Dbag$2Dsize,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58dnsName$2Dbag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58string$2Dconcatenate,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58boolean$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Dboolean,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58integer$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Dinteger,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58double$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Ddouble,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58time$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Dtime,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58date$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Ddate,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dateTime$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DdateTime,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58anyURI$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DanyURI,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DdayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DyearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58x500Name$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Dx500Name,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58rfc822Name$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2Drfc822Name,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58ipAddress$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DipAddress,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dnsName$2Dfrom$2Dstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dfrom$2DdnsName,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dstarts$2Dwith {
    public Object apply(Object... strings) {
      return String.valueOf(strings[0]).startsWith(String.valueOf(strings[1]));
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58anyURI$2Dstarts$2Dwith,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dends$2Dwith,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58anyURI$2Dends$2Dwith,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dcontains,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58anyURI$2Dcontains,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58string$2Dsubstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58anyURI$2Dsubstring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58any$2Dof,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58all$2Dof,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58any$2Dof$2Dany,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58all$2Dof$2Dany,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58any$2Dof$2Dall,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58all$2Dof$2Dall,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58map,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58anyURI$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58ipAddress$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58dnsName$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58rfc822Name$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58x500Name$2Dregexp$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58xpath$2Dnode$2Dcount,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58xpath$2Dnode$2Dequal,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58xpath$2Dnode$2Dmatch,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58string$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58boolean$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58integer$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58double$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58time$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58date$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58dateTime$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58anyURI$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58hexBinary$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58base64Binary$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dunion,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58dayTimeDuration$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dunion,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58yearMonthDuration$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58x500Name$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dintersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dat$2Dleast$2Done$2Dmember$2Dof,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dunion,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dsubset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58rfc822Name$2Dset$2Dequals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58access$2Dpermitted;

  static boolean eq(Object... P) {
    return asList(P).parallelStream().distinct().limit(2).count() == 1;
  }

  public final String token = URLDecoder.decode(name().replace("_","").replace('$', '%'));

  static class Registry {

    public static final LinkedHashMap<String, Enum> tokens = new LinkedHashMap<>();

    static {
      asList(values()).stream().forEach(f->tokens.put(f.token,f));
    }
  }
}