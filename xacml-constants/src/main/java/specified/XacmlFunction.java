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
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_equal {
    @Override
    public Boolean apply(Object[] objects) {
      return eq(objects);
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_equal_$2D_ignore_$2D_case {
    @Override
    public Boolean apply(Object... strings) {
      return asList(strings).parallelStream().map(String::valueOf).map(String::toLowerCase).distinct().limit(2).count() == 1;
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_equal {
    @Override
    public Object apply(Object[] objects) {
      return asList(objects).parallelStream().map(String::valueOf).map(Base64.getDecoder()::decode).distinct().limit(2).count() == 1;
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_add {
    @Override
    public Object apply(Object[] objects) {
      AtomicInteger r = new AtomicInteger(0);
      asList(objects).forEach(o -> r.getAndAdd((Integer) o));
      return r.get();
    }
  },
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_add,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_subtract,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_subtract,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_multiply,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_multiply,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_divide,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_divide,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_mod,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_abs,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_abs,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__round,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__floor,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_normalize_$2D_space,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_normalize_$2D_to_$2D_lower_$2D_case,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_to_$2D_integer,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_to_$2D_double,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__or,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__and,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__n_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__not,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dateTime_$2D_add_$2D_dayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dateTime_$2D_add_$2D_yearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dateTime_$2D_subtract_$2D_dayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dateTime_$2D_subtract_$2D_yearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__date_$2D_add_$2D_yearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__date_$2D_subtract_$2D_yearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__time_$2D_in_$2D_range,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_greater_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_greater_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_less_$2D_than,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_less_$2D_than_$2D_or_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_is_$2D_in,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__ipAddress_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__ipAddress_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__ipAddress_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__dnsName_$2D_one_$2D_and_$2D_only,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__dnsName_$2D_bag_$2D_size,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__dnsName_$2D_bag,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__string_$2D_concatenate,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__boolean_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_boolean,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__integer_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_integer,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__double_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_double,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__time_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_time,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__date_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_date,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dateTime_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_dateTime,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__anyURI_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_anyURI,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_dayTimeDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_yearMonthDuration,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__x500Name_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_x500Name,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__rfc822Name_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_rfc822Name,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__ipAddress_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_ipAddress,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dnsName_$2D_from_$2D_string,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_from_$2D_dnsName,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_starts_$2D_with {
    public Object apply(Object... strings) {
      return String.valueOf(strings[0]).startsWith(String.valueOf(strings[1]));
    }
  },
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__anyURI_$2D_starts_$2D_with,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_ends_$2D_with,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__anyURI_$2D_ends_$2D_with,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_contains,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__anyURI_$2D_contains,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__string_$2D_substring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__anyURI_$2D_substring,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__any_$2D_of,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__all_$2D_of,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__any_$2D_of_$2D_any,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__all_$2D_of_$2D_any,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__any_$2D_of_$2D_all,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__all_$2D_of_$2D_all,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__map,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_match,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_match,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__anyURI_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__ipAddress_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__dnsName_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__rfc822Name_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$582$2E0$58function$58__x500Name_$2D_regexp_$2D_match,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__xpath_$2D_node_$2D_count,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__xpath_$2D_node_$2D_equal,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__xpath_$2D_node_$2D_match,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__string_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__boolean_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__integer_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__double_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__time_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__date_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__dateTime_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__anyURI_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__hexBinary_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__base64Binary_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_union,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__dayTimeDuration_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_union,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__yearMonthDuration_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__x500Name_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_intersection,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_union,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_subset,
  urn$58oasis$58names$58tc$58xacml$581$2E0$58function$58__rfc822Name_$2D_set_$2D_equals,
  urn$58oasis$58names$58tc$58xacml$583$2E0$58function$58__access_$2D_permitted;

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