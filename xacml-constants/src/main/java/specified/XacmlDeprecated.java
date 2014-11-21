package specified;

import java.net.URLDecoder;
import java.util.LinkedHashMap;
import java.util.Map;

import static java.util.Arrays.asList;

public enum XacmlDeprecated{
       urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath_$2D_node_$2D_count,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath_$2D_node_$2D_equal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Axpath_$2D_node_$2D_match,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A2$2E0$3Afunction$3Auri_$2D_string_$2D_concatenate,
      http$3A$2F$2Fwww$2Ew3$2Eorg$2FTR$2F2002$2FWD_$2D_xquery_$2D_operators_$2D_20020816$23dayTimeDuration,
      http$3A$2F$2Fwww$2Ew3$2Eorg$2FTR$2F2002$2FWD_$2D_xquery_$2D_operators_$2D_20020816$23yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_equal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_equal,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime_$2D_add_$2D_dayTimeDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime_$2D_add_$2D_yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime_$2D_subtract_$2D_dayTimeDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdateTime_$2D_subtract_$2D_yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Adate_$2D_add_$2D_yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Adate_$2D_subtract_$2D_yearMonthDuration,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_intersection,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_union,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_subset,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_set_$2D_equals,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_intersection,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_union,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_subset,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_set_$2D_equals,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_one_$2D_and_$2D_only,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_bag_$2D_size,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_is_$2D_in,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AdayTimeDuration_$2D_bag,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_one_$2D_and_$2D_only,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_bag_$2D_size,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_is_$2D_in,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3AyearMonthDuration_$2D_bag,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aany_$2D_of,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aall_$2D_of,
      urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Afunction$3Aany_$2D_of_$2D_any,
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
