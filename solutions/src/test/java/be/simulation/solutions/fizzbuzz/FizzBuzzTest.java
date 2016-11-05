package be.simulation.solutions.fizzbuzz;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class FizzBuzzTest {

	@Test
	public void test() {
		List<FizzBuzzable> fizzbuzzables = new ArrayList<>();

		NumbersHandler threeAndFiveHandler = new NumbersHandler();
		NumbersHandler threeHandler = new NumbersHandler();

		fizzbuzzables.add(new FizzBuzzable(new Divider(3, 5), threeAndFiveHandler));
		fizzbuzzables.add(new FizzBuzzable(new Divider(3), threeHandler));

		new FizzBuzz(20, fizzbuzzables).run();

		assertThat(threeAndFiveHandler.numbers, is(asList(15)));
		assertThat(threeHandler.numbers, is(asList(3, 6, 9, 12, 18)));
	}

	private class NumbersHandler implements Handler {
		List<Integer> numbers = new ArrayList<>();

		@Override
		public void handle(int i) {
			numbers.add(i);
		}

	}

}
