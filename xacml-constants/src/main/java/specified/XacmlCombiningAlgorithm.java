package specified;

import java.util.Arrays;
import java.util.EnumSet;

public enum XacmlCombiningAlgorithm {
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
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
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
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
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:rule-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-deny-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_deny_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return denyOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:rule-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Arule_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.1:policy-combining-algorithm:ordered-permit-overrides
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E1$3Apolicy_$2D_combining_$2D_algorithm$3Aordered_$2D_permit_$2D_overrides {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return permitOverrides(decisions);
    }
  };

  private static XacmlEvaluation denyOverrides(XacmlEvaluation[] decisions) {
    EnumSet<XacmlEvaluation> xacmlEvaluations = EnumSet.noneOf(XacmlEvaluation.class);
    Arrays.asList(decisions).stream().distinct().forEach(xacmlEvaluations::add);
    if (xacmlEvaluations.contains(XacmlEvaluation.Deny))
      return XacmlEvaluation.Deny;
    if (xacmlEvaluations.contains(XacmlEvaluation.Indeterminate$7B__DP__$7D) || xacmlEvaluations.contains(XacmlEvaluation.Indeterminate$7B__D__$7D) && (EnumSet.of(XacmlEvaluation.Indeterminate$7B__P__$7D, XacmlEvaluation.Permit).removeAll(xacmlEvaluations))) {
      return XacmlEvaluation.Indeterminate$7B__DP__$7D;
    }
    final XacmlEvaluation[] xacmlResolutions1 = {XacmlEvaluation.Indeterminate$7B__D__$7D, XacmlEvaluation.Permit, XacmlEvaluation.Indeterminate$7B__P__$7D};
    for (XacmlEvaluation xacmlEvaluation : xacmlResolutions1)
      if (xacmlEvaluations.contains(xacmlEvaluation))
        return xacmlEvaluation;
    return XacmlEvaluation.NotApplicable;
  }

  private static XacmlEvaluation permitOverrides(XacmlEvaluation[] decisions) {
    EnumSet<XacmlEvaluation> xacmlEvaluations = EnumSet.noneOf(XacmlEvaluation.class);
    Arrays.asList(decisions).stream().distinct().forEach(xacmlEvaluations::add);
    if (xacmlEvaluations.contains(XacmlEvaluation.Permit))
      return XacmlEvaluation.Permit;
    if (xacmlEvaluations.contains(XacmlEvaluation.Indeterminate$7B__DP__$7D) || xacmlEvaluations.contains(XacmlEvaluation.Indeterminate$7B__P__$7D) && (EnumSet.of(XacmlEvaluation.Indeterminate$7B__D__$7D, XacmlEvaluation.Deny).removeAll(xacmlEvaluations))) {
      return XacmlEvaluation.Indeterminate$7B__DP__$7D;
    }
    final XacmlEvaluation[] xacmlResolutions1 = {XacmlEvaluation.Indeterminate$7B__P__$7D, XacmlEvaluation.Deny, XacmlEvaluation.Indeterminate$7B__D__$7D};
    for (XacmlEvaluation xacmlEvaluation : xacmlResolutions1)
      if (xacmlEvaluations.contains(xacmlEvaluation))
        return xacmlEvaluation;
    return XacmlEvaluation.NotApplicable;
  }
;

  static public XacmlCombiningAlgorithm from(String key) {
    return Xacml3.from(key, XacmlCombiningAlgorithm.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

  public XacmlEvaluation apply(XacmlEvaluation... decisions) {
    throw new UnsupportedOperationException();
  }
}
