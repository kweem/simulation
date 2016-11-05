package be.simulation.solutions.pascal;

import static be.simulation.solutions.pascal.Calculator.factorial;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		assertThat(factorial(1), is(1));
		assertThat(factorial(4), is(24));
		assertThat(factorial(5), is(120));
	}

}
