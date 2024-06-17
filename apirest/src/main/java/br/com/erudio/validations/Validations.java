package br.com.erudio.validations;

import br.com.erudio.Exceptions.UnsupportedMathOperation;

public class Validations {
	
	
	public static void validationNumeric(String number) {
		if(number == null || !isNumeric(number)) {
			throw new UnsupportedMathOperation("Please set a numeric value");
		}
	}
	public static boolean isNumeric(String strNumber) {
	    if(strNumber == null) return false;
			
		String number = strNumber.replaceAll(",", ".");
							
			return number.matches("[+-]?[0-9]*\\.?[0-9]+");
	}

}
