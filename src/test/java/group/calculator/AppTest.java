package group.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import group.calculator.App;

public class AppTest {
	Calculator c = new Calculator();
	
	@Test
	public void CalcTest() {
		assertEquals(2, c.sum(1,1));
	}
	

}
