package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class MultiplyTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
	    int multiplyOutput = calculator.multiply(7, 7);
	   
	    assertEquals(49,multiplyOutput);
	    
		}

}
