package policyxform;

/**
 * non-public config class for FSM specific configs
 */
public final class Config {
	public static String get(String ox_var, String... defaultVal) {
		String javapropname = "xcaml."
				+ ox_var.toLowerCase().replaceAll("^xcaml_", "").replace('_',
						'.');
		String oxenv = System.getenv(ox_var);
		String var = null == oxenv ? System.getProperty(javapropname) : oxenv;
		var = null == var && defaultVal.length > 0 ? defaultVal[0] : var;
		if (null != var) {
			System.setProperty(javapropname, var);
			System.err
					.println("// -D" + javapropname + "=" + "\"" + var + "\"");
		}
		return var;
	}
}
