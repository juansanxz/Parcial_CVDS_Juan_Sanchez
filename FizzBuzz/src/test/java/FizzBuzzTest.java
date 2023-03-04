package test.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import fizzBuzzException.FizzBuzzExceptions;
import fizzBuzzException.Out_Of_Range_Exception;
import main.java.fizzBuzz.FizzBuzz;

/**
 * Class for testing the fizzBuzzGame method in FizzBuzz class
 * Equivalence Classes:
 * 1. Prints a number between 1 and 100, that is not multiple of three or five, and the number does not contain
 * a three or five
 * 2. Prints Fizz because the number is multiple of three but not multiple of five
 * 3. Prints Buzz because the number is multiple of five but not multiple of three
 * 4. Prints FizzBuzz because the number is multiple of five and three
 * 5. Prints Fizz because the number contains a three
 * 6. Prints Buzz because the number contains a five
 * 7. Prints FizzBuzz because the number contains a five and a three
 * 8. Prints FizzBuzz because the number is multiple of three or five and contains a three or five 
 * @author Juan Sanchez
 *
 */
class FizzBuzzTest {

	FizzBuzz fizzBuzzGame;
	
	@BeforeEach
	public void createAnOrginalScoreObject () {
		fizzBuzzGame = new FizzBuzz();
	}
		
	@Test
	public void should_PrintANumber_When_NumberDoesNotContainAThreeOrAFive_And_IsNotAMultipleOfThose () {			
		//arrange
		int number = 1;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			
		}
			
		//assert
		assertEquals("1", answer);
	}
	
	@Test
	public void should_PrintFizz_When_NumberIsAMultipleOfThree_But_IsNotAMultipleOfFive () {			
		//arrange
		int number = 9;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...Fizz...", answer);
	}

	@Test
	public void should_PrintBuzz_When_NumberIsAMultipleOfFive_But_IsNotAMultipleOfThree () {			
		//arrange
		int number = 10;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...Buzz...", answer);
	}
	
	@Test
	public void should_PrintFizzBuzz_When_NumberIsAMultipleOfThreeAndFive () {			
		//arrange
		int number = 15;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...FizzBuzz...", answer);
	}
	
	@Test
	public void should_PrintFizz_When_NumberContainsAThree () {			
		//arrange
		int number = 13;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...Fizz...", answer);
	}
	
	@Test
	public void should_PrintBuzz_When_NumberContainsAFive () {			
		//arrange
		int number = 58;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...Buzz...", answer);
	}

	@Test
	public void should_PrintFizzBuzz_When_NumberContainsAThreeAndAFive () {			
		//arrange
		int number = 53;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...FizzBuzz...", answer);
	}
	
	@Test
	public void should_PrintFizzBuzz_When_NumberIsMultipleOfThreeOrFive_And_ContainsAThreeOrAFive () {			
		//arrange
		int number = 57;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (FizzBuzzExceptions e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			
		//assert
		assertEquals("...FizzBuzz...", answer);
	}
	
	@Test
	public void should_ThrowsAnOutOfRangeException_When_NumberIsLessThanOne_Or_GreaterThanOneHundred() throws FizzBuzzExceptions {			
		//arrange
		int number = 0;
		String answer = "";
			
		//act
		try {
			answer = fizzBuzzGame.fizzBuzzGame(number);
		} catch (Out_Of_Range_Exception e) {
			//assert
			assertEquals("El número debe estar entre 1 y 100", e.getMessage());
		}
			
		
	}
}
