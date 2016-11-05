package be.simulation.solutions.pascal;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class PascalTest {

	private static final int NEWLINE = Integer.MIN_VALUE;

	@Test
	public void triangle() {
		TestHandler handler = new TestHandler();
		new Pascal(handler).triangle(5);

		assertThat(handler.numbers,
				is(asList(1, NEWLINE, 1, 1, NEWLINE, 1, 2, 1, NEWLINE, 1, 3, 3, 1, NEWLINE, 1, 4, 6, 4, 1, NEWLINE)));
	}

	private class TestHandler implements Handler {

		List<Integer> numbers = new ArrayList<>();

		@Override
		public void execute(int i) {
			numbers.add(i);
		}

		@Override
		public void execute() {
			numbers.add(NEWLINE);
		}

	}

}
