package group.calculator;

public class Calculator {

	public static int sum(int a, int b) {
		  return a + b;
	  }
	public static int sub(int a, int b) {
		  return a - b;
	  }
	public static int mult(int a, int b) {
		  return a * b;
	  }
	public static int div(int a, int b) {
		if(b==0) {
			return 0;
		}
		  return a / b;
	  }
}

