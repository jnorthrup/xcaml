package specified;

import java.util.Arrays;
import java.util.EnumSet;

public enum XacmlCombiningAlgorithm {
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:first-applicable
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable,
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:first-applicable
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable,
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:only-one-applicable
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aonly_$2D_one_$2D_applicable,
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:deny-unless-permit
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit,
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:permit-unless-deny
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny,
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:deny-unless-permit
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit,
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:permit-unless-deny
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny,
  /**
   * urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlResolution apply(XacmlResolution... decisions) {
      return permitOverrides(decisions);
    }
  };

  private static XacmlResolution denyOverrides(XacmlResolution[] decisions) {
    EnumSet<XacmlResolution> xacmlResolutions = EnumSet.noneOf(XacmlResolution.class);
    Arrays.asList(decisions).stream().distinct().forEach(xacmlResolutions::add);
    if (xacmlResolutions.contains(XacmlResolution.Deny))
      return XacmlResolution.Deny;
    if (xacmlResolutions.contains(XacmlResolution.Indeterminate$7B__DP__$7D) || xacmlResolutions.contains(XacmlResolution.Indeterminate$7B__D__$7D) && (EnumSet.of(XacmlResolution.Indeterminate$7B__P__$7D, XacmlResolution.Permit).removeAll(xacmlResolutions))) {
      return XacmlResolution.Indeterminate$7B__DP__$7D;
    }
    final XacmlResolution[] xacmlResolutions1 = {XacmlResolution.Indeterminate$7B__D__$7D, XacmlResolution.Permit, XacmlResolution.Indeterminate$7B__P__$7D};
    for (XacmlResolution xacmlResolution : xacmlResolutions1)
      if (xacmlResolutions.contains(xacmlResolution))
        return xacmlResolution;
    return XacmlResolution.NotApplicable;
  }

  private static XacmlResolution permitOverrides(XacmlResolution[] decisions) {
    EnumSet<XacmlResolution> xacmlResolutions = EnumSet.noneOf(XacmlResolution.class);
    Arrays.asList(decisions).stream().distinct().forEach(xacmlResolutions::add);
    if (xacmlResolutions.contains(XacmlResolution.Permit))
      return XacmlResolution.Permit;
    if (xacmlResolutions.contains(XacmlResolution.Indeterminate$7B__DP__$7D) || xacmlResolutions.contains(XacmlResolution.Indeterminate$7B__P__$7D) && (EnumSet.of(XacmlResolution.Indeterminate$7B__D__$7D, XacmlResolution.Deny).removeAll(xacmlResolutions))) {
      return XacmlResolution.Indeterminate$7B__DP__$7D;
    }
    final XacmlResolution[] xacmlResolutions1 = {XacmlResolution.Indeterminate$7B__P__$7D, XacmlResolution.Deny, XacmlResolution.Indeterminate$7B__D__$7D};
    for (XacmlResolution xacmlResolution : xacmlResolutions1)
      if (xacmlResolutions.contains(xacmlResolution))
        return xacmlResolution;
    return XacmlResolution.NotApplicable;
  }
;

  static public XacmlCombiningAlgorithm from(String key) {
    return Xacml3.from(key, XacmlCombiningAlgorithm.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

  public XacmlResolution apply(XacmlResolution... decisions) {
    throw new UnsupportedOperationException();
  }
}
