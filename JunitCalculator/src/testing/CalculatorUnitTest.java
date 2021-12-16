package testing;

import static org.junit.Assert.*;

import org.junit.Test;



public class CalculatorUnitTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
	    int additionOutput = calculator.add(1, 2);
	    int subtrationOutput = calculator.subtract(10, 2);
	    
	    assertEquals(3,additionOutput);
	    assertEquals(8,subtrationOutput);
		}

}
