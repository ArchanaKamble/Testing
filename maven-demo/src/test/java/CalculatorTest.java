

import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void testIfAddIsWorkingorNot() {
		Calculator c = new Calculator();
		int result = c.add(10, 20);
		int expected = 30;
		assertEquals(expected, result);
		
	}
	
	@Test
	public void testIfSubIsWorkingorNot() {
		Calculator c = new Calculator();
		int result1 = c.sub(20, 20);
		int expected1 = 0;
		assertEquals(expected1, result1);
	}

}
