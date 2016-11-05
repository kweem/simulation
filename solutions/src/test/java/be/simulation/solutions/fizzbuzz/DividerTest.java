package be.simulation.solutions.fizzbuzz;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class DividerTest {

	@Test
	public void dividable() {
		assertThat(new Divider(2).apply(6), is(true));
		assertThat(new Divider(2, 5, 7).apply(70), is(true));
	}

	@Test
	public void notDividable() {
		assertThat(new Divider(2).apply(7), is(false));
		assertThat(new Divider(2, 5, 7, 10).apply(10), is(false));
		assertThat(new Divider(2, 5, 7, 10).apply(2), is(false));
		assertThat(new Divider(2, 5, 7, 10).apply(5), is(false));
		assertThat(new Divider(2, 5, 7, 10).apply(7), is(false));
		assertThat(new Divider(2, 5, 7, 10).apply(4), is(false));
	}

}
