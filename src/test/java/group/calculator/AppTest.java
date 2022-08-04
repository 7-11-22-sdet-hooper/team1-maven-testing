package group.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import group.calculator.App;

public class AppTest {
	Calculator c = new Calculator();
	
	@Test
	public void sumTest() {
		assertEquals(5, c.sum(1,1));
	}
	
	@Test
	public void subTestt() {
		assertEquals(2, c.sub(3,1));
	}
	
	@Test
	public void multTest() {
		assertEquals(2, c.mult(2,1));
	}
	
	@Test
	public void divTest() {
		assertEquals(2, c.div(4,2));
	}
	/// test change
}
