package Constant;

import java.util.regex.Pattern;

public class Constantes {
	/*
	 * Validacion de la Matricula
	 */
	public static Pattern REGEX_MATRICULA = Pattern
			.compile("^([A-Z]{1,2})([0-9]{4})([A-Z]{1,2})$|^([0-9]{4})([A-Z]{3})$");
}
