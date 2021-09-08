package io.javaCalculator;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUnitsTest {

	private final MathUnits cal = new MathUnits();
	
	@Test
	public void addTestcase() { Assertions.assertEquals(10,cal.addTwoNumber(5, 5));}
	
	@Test
	public void subTestcase() { Assertions.assertEquals( -3 , cal.subTwoNumber(2, 5));}
	
	@Test
	public void divTestcase() { Assertions.assertEquals(5,cal.divTwoNumber(25, 5));}
	
	@Test
	public void multTestcase() 	{ Assertions.assertEquals(25, cal.multTwoNumber(5, 5));}		
	
	@Test
	// operation  => 2 + 1 + 4 x 2 
	public void verfiyBODMAS() { Assertions.assertEquals(11,(cal.addTwoNumber(2, 1) + 4 * 2 ));	}
	
	@Test
	public void verfiyDecimalNumber() { Assertions.assertEquals(5,cal.addTwoNumber(2.1, 2.9));	}
	
	@Test
	@DisplayName("Division by zero should throw an ArithmeticException")
	void divideByZero() {
		Exception exception = assertThrows(ArithmeticException.class, () -> cal.divTwoNumber(1, 0));
		assertEquals("/ by zero", exception.getMessage());
	}
	

}
