package be.simulation.solutions.pascal;

public class Calculator {

	public static int factorial(int n) {
		if (n < 1) {
			return 1;
		}
		return n * factorial(n - 1);
	}
}
