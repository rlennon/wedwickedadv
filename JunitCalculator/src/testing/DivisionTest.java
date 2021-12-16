package testing;

import static org.junit.Assert.*;

import org.junit.Test;

public class DivisionTest {

	@Test
	public void test() {
		Calculator calculator = new Calculator();
	    int divisionOutput = calculator.divide(6, 2);
	   
	    assertEquals(3,divisionOutput);
	    
		}

}
