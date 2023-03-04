package main.java.fizzBuzz;

import fizzBuzzException.FizzBuzzExceptions;
import fizzBuzzException.Out_Of_Range_Exception;

public class FizzBuzz {
	private static final String fizz = "...Fizz...";
	private static final String buzz = "...Buzz...";
	private static final String fizzBuzz = "...FizzBuzz...";
	
	public FizzBuzz() {
		
	}
	
	public  String fizzBuzzGame (int number) throws FizzBuzzExceptions{
		if (number < 1 || number > 100) throw new Out_Of_Range_Exception("El número debe estar entre 1 y 100");
		String value = String.valueOf(number);
		String answer = "";
		if (value.contains("3")) {
			if (value.contains("5")) {
				return fizzBuzz;
			}
			answer = fizz;
			
		} else if (value.contains("5")) {
			answer = buzz;
		}
		if (number % 3 == 0) {
			if (number % 5 == 0) {
				return fizzBuzz;
			} 
			if (answer.contains("Buzz")) {

				return fizzBuzz;
			}
			return fizz;
		} else if  (number % 5 == 0) {
			if (answer.contains("Fizz")) {

				return fizzBuzz;
			}
			return buzz;
		} 
		if (answer.equals("")) {
			return value;
		}
		return answer;
		
	}
	
}
