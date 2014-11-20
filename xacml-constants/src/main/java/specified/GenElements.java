package specified;

import com.google.common.net.UrlEscapers;

public class GenElements {
  public static void main(String[] args) {
    String s ;
s=
 "NotApplicable\n" +
     "NotApplicable\n" +
     "Permit\n" +
     "Indeterminate{P}\n" +
     "Deny\n" +
     "Indeterminate{D}\n" +
     "Indeterminate\n" +
     "Indeterminate{DP}\n" +
     "Indeterminate{DP}\n" +
     "Indeterminate{DP}\n" +
     "Indeterminate{P}\n" +
     "Indeterminate{P}\n" +
     "Indeterminate{D}\n" +
     "Indeterminate{D}\n"
    ;
    String[] split = s.split("\n");
    for (int i = 0; i < split.length; i+=2) {
      String s1 = split[i];
      String s2 = split[i+1];
      System.out.println("put(" +escape(s1) +
          ","+escape(s2)+");");

    }
  }

  private static String escape(String s1) {
    return UrlEscapers.urlFormParameterEscaper().escape(String.valueOf(s1)).replace('%','$').replace(".","$2E").replace("-","$2D");
  }
}
