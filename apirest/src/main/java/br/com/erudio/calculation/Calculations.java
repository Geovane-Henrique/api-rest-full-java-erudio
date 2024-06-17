package br.com.erudio.calculation;
import br.com.erudio.calculation.ConvertToDouble;
public class Calculations {
	
	public static double soma(String numberOne ,String numberTwo) {
		return ConvertToDouble.convertToDouble(numberTwo) +  ConvertToDouble.convertToDouble(numberOne) ;		
	}
	public static double sub(String numberOne ,String numberTwo) {
		return ConvertToDouble.convertToDouble(numberTwo) -  ConvertToDouble.convertToDouble(numberOne) ;		
	}
	public static double div(String numberOne ,String numberTwo) {
		return ConvertToDouble.convertToDouble(numberTwo) /  ConvertToDouble.convertToDouble(numberOne) ;		
	}
	public static double mut(String numberOne ,String numberTwo) {
		return ConvertToDouble.convertToDouble(numberTwo) *  ConvertToDouble.convertToDouble(numberOne) ;		
	}
	public static double med(String numberOne ,String numberTwo) {
		return (ConvertToDouble.convertToDouble(numberTwo) +  ConvertToDouble.convertToDouble(numberOne)) / 2 ;		
	}
	public static double raiz(String number) {
		double num = ConvertToDouble.convertToDouble(number);
		 return Math.sqrt(num); 		
	}

}
