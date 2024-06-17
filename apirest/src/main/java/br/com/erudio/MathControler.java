package br.com.erudio;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.erudio.calculation.ConvertToDouble;
import br.com.erudio.validations.Validations;
import br.com.erudio.calculation.Calculations;

@RestController
public class MathControler {
 
	
	@RequestMapping(value = "/soma/{numberOne}/{numberTwo}",
	method = RequestMethod.GET)
	public double soma(
			@PathVariable(value = "numberOne") String numberOne,
			@PathVariable(value = "numberTwo") String numberTwo) 
			throws Exception
	{		
		     Validations.validationNumeric(numberOne);
		     Validations.validationNumeric(numberTwo);
		
		return Calculations.soma(numberOne,numberTwo) ;
	}
	
	@RequestMapping(value = "/sub/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
			public double sub(
					@PathVariable(value = "numberOne") String numberOne,
					@PathVariable(value = "numberTwo") String numberTwo) 
					throws Exception
			{
		Validations.validationNumeric(numberOne);
	     Validations.validationNumeric(numberTwo);
	     return Calculations.sub(numberOne,numberTwo) ;
			}
	
	@RequestMapping(value = "/mut/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
			public double mut(
					@PathVariable(value = "numberOne") String numberOne,
					@PathVariable(value = "numberTwo") String numberTwo) 
					throws Exception
			{
		Validations.validationNumeric(numberOne);
	     Validations.validationNumeric(numberTwo);
	     return Calculations.mut(numberOne,numberTwo) ; 
			}
	
	@RequestMapping(value = "/div/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
			public double div(
					@PathVariable(value = "numberOne") String numberOne,
					@PathVariable(value = "numberTwo") String numberTwo) 
					throws Exception
			{
		Validations.validationNumeric(numberOne);
	     Validations.validationNumeric(numberTwo);
				return Calculations.div(numberOne,numberTwo) ;
			}
	
	@RequestMapping(value = "/med/{numberOne}/{numberTwo}",
			method = RequestMethod.GET)
			public double med(
					@PathVariable(value = "numberOne") String numberOne,
					@PathVariable(value = "numberTwo") String numberTwo) 
					throws Exception
			{
		Validations.validationNumeric(numberOne);
	     Validations.validationNumeric(numberTwo);
	     return Calculations.med(numberOne,numberTwo) ;
			}
	
	@RequestMapping(value = "/raiz/{number}",
			method = RequestMethod.GET)
			public double raiz(
					@PathVariable(value = "number") String number)
							throws Exception
			{
		        Validations.validationNumeric(number);
					
				
		        return Calculations.raiz(number) ;
			}

	

	
	}
