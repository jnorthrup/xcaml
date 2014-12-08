package specified;

import static specified.XacmlEvaluation.*;

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
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Arule_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return firstApplicable(decisions);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:first-applicable
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Afirst_$2D_applicable {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return firstApplicable(decisions);

    }
  },
  /**
   * urn:oasis:names:tc:xacml:1.0:policy-combining-algorithm:only-one-applicable
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A1$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Aonly_$2D_one_$2D_applicable {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... decisions) {
      return onlyOneApplicable(decisions);
    }
  },
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
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... children) {
      return denyUnlessPermit(children);
    }
  },

  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:deny-unless-permit
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Adeny_$2D_unless_$2D_permit {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... children) {
      return denyUnlessPermit(children);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:policy-combining-algorithm:permit-unless-deny
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Apolicy_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... children) {
      return permitUnlessDeny(children);
    }
  },
  /**
   * urn:oasis:names:tc:xacml:3.0:rule-combining-algorithm:permit-unless-deny
   */
  urn$3Aoasis$3Anames$3Atc$3Axacml$3A3$2E0$3Arule_$2D_combining_$2D_algorithm$3Apermit_$2D_unless_$2D_deny {
    @Override
    public XacmlEvaluation apply(XacmlEvaluation... children) {
      return permitUnlessDeny(children);
    }
  },
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

  private static XacmlEvaluation denyUnlessPermit(XacmlEvaluation... children) {
    for (XacmlEvaluation child : children) {
      switch (child) {
        case Permit:
          return Permit;
      }

    }
    return Deny;
  }

  private static XacmlEvaluation permitUnlessDeny(XacmlEvaluation... children) {
    for (XacmlEvaluation child : children) {
      switch (child) {
        case Deny:
          return Deny;
      }

    }
    return Permit;
  }

  private static XacmlEvaluation onlyOneApplicable(XacmlEvaluation[] decisions) {
    boolean atLeastOne = false;
    XacmlEvaluation theOne = NotApplicable;
    l1 : for (XacmlEvaluation decision : decisions) {
      switch (decision) {

        case Permit:
        case Deny:
          if (atLeastOne) {
            theOne = Indeterminate;
            break l1;
          } else {
            atLeastOne = true;
            theOne = decision;

          }
          break;

        case NotApplicable:
          break;
        default:
          theOne = Indeterminate;
          break l1;
      }
    }
    return theOne;
  }

  private static XacmlEvaluation firstApplicable(XacmlEvaluation... decisions) {
    for (XacmlEvaluation decision : decisions) {
      if (decision == Deny)
        return Deny;
      if (decision == Permit)
        return Permit;
      if (decision == NotApplicable)
        continue;
      if (decision == Indeterminate)
        return Indeterminate;
    }
    return NotApplicable;
  }

  private static XacmlEvaluation denyOverrides(XacmlEvaluation[] children) {
    {

      boolean atLeastOneErrorD = false;
      boolean atLeastOneErrorP = false;
      boolean atLeastOneErrorDP = false;
      boolean atLeastOnePermit = false;
      for (XacmlEvaluation decision : children)
        switch (decision) {
          case Deny:

            return Deny;

          case Permit:
            atLeastOnePermit = true;
            break;
          case NotApplicable:

            break;
          case Indeterminate$7B__D__$7D:

            atLeastOneErrorD = true;

            break;
          case Indeterminate$7B__P__$7D:

            atLeastOneErrorP = true;

            break;
          case Indeterminate$7B__DP__$7D:

            atLeastOneErrorDP = true;

            break;
        }
      if (atLeastOneErrorDP || atLeastOneErrorD && (atLeastOneErrorP || atLeastOnePermit))
        return Indeterminate$7B__DP__$7D;
      if (atLeastOneErrorD)
        return Indeterminate$7B__D__$7D;
      if (atLeastOnePermit)
        return Permit;
      else
        return atLeastOneErrorP ? Indeterminate$7B__P__$7D : NotApplicable;

    }
  }

  private static XacmlEvaluation permitOverrides(XacmlEvaluation[] decisions) {
    Boolean atLeastOneErrorD = false;
    Boolean atLeastOneErrorP = false;
    Boolean atLeastOneErrorDP = false;
    Boolean atLeastOneDeny = false;

    for (XacmlEvaluation decision : decisions)
      switch (decision) {
        case Deny:
          atLeastOneDeny = true;
          break;
        case Permit:
          return Permit;
        case NotApplicable:
          break;
        case Indeterminate$7B__D__$7D:
          atLeastOneErrorD = true;
          break;
        case Indeterminate$7B__P__$7D:
          atLeastOneErrorP = true;
          break;
        case Indeterminate$7B__DP__$7D:
          atLeastOneErrorDP = true;
      }
    if (atLeastOneErrorDP || atLeastOneErrorP && (atLeastOneErrorD || atLeastOneDeny))
      return Indeterminate$7B__DP__$7D;
    if (atLeastOneErrorP)
      return Indeterminate$7B__P__$7D;
    else if (atLeastOneDeny)
      return Deny;
    else if (atLeastOneErrorD)
      return Indeterminate$7B__D__$7D;
    return NotApplicable;
  }

  static public XacmlCombiningAlgorithm from(String key) {
    return Xacml3.from(key, XacmlCombiningAlgorithm.class);
  }

  public String token() {
    return Xacml3.token(this);
  }

  abstract public XacmlEvaluation apply(XacmlEvaluation... decisions);
}
