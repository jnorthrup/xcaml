package specified;

import com.google.common.collect.ImmutableSet;
import com.google.common.reflect.ClassPath;
import specified.impl.Other;

import java.io.IOException;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * {@link specified.XacmlFunctionProto} enum elements compose a .h file, where {@link specified.impl} package provides
 * .cxx for the runtime to bind functions to those function prototypes.
 * <p/>
 * the first time a {@link specified.XacmlFunctionProto} is called and executes
 * {@link specified.XacmlFunctionProto#apply}, the registration of that element iterates this package for the first
 * matching {@link specified.BindXacmlFunctions} or {@link specified.BindUri} element to provide apply().
 * <p/>
 * if for whatever reason it makes sense, apply() can be overridden inline below to circumvent the map lookup.
 */
public enum XacmlFunctionProto implements F {

  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-equal
   */
  @XacmlSignature(value = {
      XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string,
      XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string,}, returns = XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean)
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-equal
   */
  @XacmlSignature(value = {
      XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean,
      XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean}, returns = XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean)
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-equal-ignore-case
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_equal_$2D_ignore_$2D_case,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-add
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_add,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-add
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_add,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-subtract
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_subtract,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-subtract
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_subtract,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-multiply
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_multiply,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-multiply
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_multiply,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-divide
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_divide,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-divide
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_divide,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-mod
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_mod,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-abs
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_abs,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-abs
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_abs,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:round
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__round,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:floor
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__floor,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-normalize-space
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_normalize_$2D_space,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-normalize-to-lower-case
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_normalize_$2D_to_$2D_lower_$2D_case,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-to-integer
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_to_$2D_integer,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-to-double
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_to_$2D_double,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:or
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__or,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:and
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__and,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:n-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__n_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:not
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__not,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dateTime-add-dayTimeDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dateTime_$2D_add_$2D_dayTimeDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dateTime-add-yearMonthDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dateTime_$2D_add_$2D_yearMonthDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dateTime-subtract-dayTimeDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dateTime_$2D_subtract_$2D_dayTimeDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dateTime-subtract-yearMonthDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dateTime_$2D_subtract_$2D_yearMonthDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:date-add-yearMonthDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__date_$2D_add_$2D_yearMonthDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:date-subtract-yearMonthDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__date_$2D_subtract_$2D_yearMonthDuration,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:time-in-range
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__time_$2D_in_$2D_range,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-greater-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_greater_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-greater-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_greater_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-less-than
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_less_$2D_than,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-less-than-or-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_less_$2D_than_$2D_or_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-is-in
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_is_$2D_in,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:ipAddress-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__ipAddress_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:ipAddress-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__ipAddress_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:ipAddress-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__ipAddress_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:dnsName-one-and-only
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__dnsName_$2D_one_$2D_and_$2D_only,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:dnsName-bag-size
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__dnsName_$2D_bag_$2D_size,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:dnsName-bag
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__dnsName_$2D_bag,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:string-concatenate
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__string_$2D_concatenate,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:boolean-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__boolean_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-boolean
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_boolean,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:integer-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__integer_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-integer
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_integer,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:double-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__double_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-double
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_double,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:time-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__time_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-time
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_time,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:date-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__date_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-date
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_date,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dateTime-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dateTime_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-dateTime
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_dateTime,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:anyURI-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__anyURI_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-anyURI
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_anyURI,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-dayTimeDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_dayTimeDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-yearMonthDuration
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_yearMonthDuration,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:x500Name-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__x500Name_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-x500Name
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_x500Name,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:rfc822Name-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__rfc822Name_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-rfc822Name
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_rfc822Name,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:ipAddress-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__ipAddress_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-ipAddress
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_ipAddress,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dnsName-from-string
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dnsName_$2D_from_$2D_string,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-from-dnsName
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_from_$2D_dnsName,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-starts-with
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_starts_$2D_with,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:anyURI-starts-with
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__anyURI_$2D_starts_$2D_with,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-ends-with
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_ends_$2D_with,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:anyURI-ends-with
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__anyURI_$2D_ends_$2D_with,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-contains
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_contains,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:anyURI-contains
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__anyURI_$2D_contains,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:string-substring
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__string_$2D_substring,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:anyURI-substring
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__anyURI_$2D_substring,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:any-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__any_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:all-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__all_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:any-of-any
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__any_$2D_of_$2D_any,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:all-of-any
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__all_$2D_of_$2D_any,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:any-of-all
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__any_$2D_of_$2D_all,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:all-of-all
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__all_$2D_of_$2D_all,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:map
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__map,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-match This function SHALL take two arguments, the first is of
   * data-type “http://www.w3.org/2001/XMLSchema#string” and the second is of data-type
   * “urn:oasis:names:tc:xacml:1.0:data-type:rfc822Name” and SHALL return an “http://www.w3.org/2001/XMLSchema#boolean”.
   * This function SHALL evaluate to "True" if the first argument matches the second argument according to the following
   * specification.
   * <p/>
   * An RFC822 name consists of a local-part followed by "@" followed by a domain-part. The local-part is
   * case-sensitive, while the domain-part (which is usually a DNS name) is not case-sensitive.
   * <p/>
   * The second argument contains a complete rfc822Name. The first argument is a complete or partial rfc822Name used to
   * select appropriate values in the second argument as follows.
   * <p/>
   * In order to match a particular address in the second argument, the first argument must specify the complete mail
   * address to be matched. For example, if the first argument is “Anderson@sun.com”, this matches a value in the second
   * argument of “Anderson@sun.com” and “Anderson@SUN.COM”, but not “Anne.Anderson@sun.com”, “anderson@sun.com” or
   * “Anderson@east.sun.com”.
   * <p/>
   * In order to match any address at a particular domain in the second argument, the first argument must specify only a
   * domain name (usually a DNS name). For example, if the first argument is “sun.com”, this matches a value in the
   * first argument of “Anderson@sun.com” or “Baxter@SUN.COM”, but not “Anderson@east.sun.com”.
   * <p/>
   * In order to match any address in a particular domain in the second argument, the first argument must specify the
   * desired domain-part with a leading ".". For example, if the first argument is “.east.sun.com”, this matches a value
   * in the second argument of "Anderson@east.sun.com" and "anne.anderson@ISRG.EAST.SUN.COM" but not "Anderson@sun.com".
   */
  @XacmlSignature({
      XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string,
      XacmlDataType.urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Adata_$2D_type$3A__rfc822Name})
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:anyURI-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__anyURI_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:ipAddress-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__ipAddress_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:dnsName-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__dnsName_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:rfc822Name-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__rfc822Name_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:2.0:function:x500Name-regexp-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_2$2E0_$3Afunction$3A__x500Name_$2D_regexp_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:xpath-node-count
   */
  @XacmlSignature(value = {
      XacmlDataType.urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Adata_$2D_type$3A__xpathExpression,
      XacmlDataType.ContentType}, returns = XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__integer)
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__xpath_$2D_node_$2D_count,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:xpath-node-equal
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__xpath_$2D_node_$2D_equal,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:xpath-node-match
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__xpath_$2D_node_$2D_match,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:string-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__string_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:boolean-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__boolean_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:integer-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__integer_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:double-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__double_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:time-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__time_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:date-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__date_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:dateTime-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__dateTime_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:anyURI-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__anyURI_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:hexBinary-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__hexBinary_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:base64Binary-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__base64Binary_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:dayTimeDuration-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__dayTimeDuration_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:yearMonthDuration-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__yearMonthDuration_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:x500Name-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__x500Name_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-intersection
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_intersection,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-at-least-one-member-of
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_at_$2D_least_$2D_one_$2D_member_$2D_of,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-union
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_union,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-subset
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_subset,
  /**
   * urn:oasis:names:tc:xacml:1.0:function:rfc822Name-set-equals
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_1$2E0_$3Afunction$3A__rfc822Name_$2D_set_$2D_equals,
  /**
   * urn:oasis:names:tc:xacml:3.0:function:access-permitted
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A_3$2E0_$3Afunction$3A__access_$2D_permitted;
  public static final F NOT_IMPLEMENTED = new F() {
  };
  static private Map<XacmlFunctionProto, F> delegates = new EnumMap<XacmlFunctionProto, F>(
      XacmlFunctionProto.class);

  final public <T> boolean predicate(T... p) {
    return (boolean) apply(p);
  }

  static public XacmlFunctionProto from(String key) {
    return Registrar.from(key, XacmlFunctionProto.class);
  }

  public String token() {
    return Registrar.token(this);
  }

  public XacmlDataType returns;
  public XacmlDataType[] parms;

  static class Helper {
    static Package implPackage = Other.class.getPackage();
    static ImmutableSet<ClassPath.ClassInfo> topLevelClasses;

    static {
      try {
        topLevelClasses =
            ClassPath.from(ClassLoader.getSystemClassLoader()).getTopLevelClasses(
                implPackage.getName());
      } catch (IOException e) {
      }
    }
  }

  @Override
    public <T> T apply(Object... objects) {
        assert (validateCallParms(this, objects)) : "parameters for " + name() + " dont fit";
        F xacmlFunction2 = delegates.computeIfAbsent(this, xacmlFunction -> {
            {
                String token = token();
                F ret = null;
                for (ClassPath.ClassInfo topLevelClass : Helper.topLevelClasses) {
                    Class<?> load = topLevelClass.load();
                    if (F.class.isAssignableFrom(load) && Enum.class.isAssignableFrom(load)) {
                        Object[] enumConstants = load.getEnumConstants();
                        for (Object enumConstant : enumConstants) {
                            Enum e = (Enum) enumConstant;
                            try {
                                BindXacmlFunctions a = load.getField(e.name()).getAnnotation(BindXacmlFunctions.class);
                                BindUri annotation = load.getField(e.name()).getAnnotation(BindUri.class);

                                if (null != annotation && Arrays.asList(annotation.value()).contains(token) || null != a && Arrays.asList(a.value()).contains(this)) {
                                    ret = (F) enumConstant;
                                    break;
                                }

                            } catch (NoSuchFieldException e1) {


                            }
                        }

                    }
                }
                return ret != null ? ret : NOT_IMPLEMENTED;
            }
        });

        return (T) xacmlFunction2.apply(objects);
    }

  /**
   * cross reference the {@link #parms} in this prototype against the runtime parameters passed in via objects
   * 
   * @param xacmlFunctionProto
   * @param objects
   * @return todo: true if the right objects are passed in
   */
  private boolean validateCallParms(XacmlFunctionProto xacmlFunctionProto, Object... objects) {

    return true;// todo: real validation that's in the unit tests presently
  }

  XacmlFunctionProto() {
    parms =
        new XacmlDataType[] {XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__string};
    returns = XacmlDataType.http$3A$2F$2Fwww$2Ew3$2Eorg$2F2001$2FXMLSchema$23__boolean;
    try {
      XacmlSignature annotation = getClass().getField(name()).getAnnotation(XacmlSignature.class);
      parms = annotation.value();
      returns = annotation.returns();
    } catch (Throwable e) {
    }
  }

}
