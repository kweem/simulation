package be.simulation.solutions.pascal;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class TriangleTest {

	@Test
	public void firstColumnShouldAlwaysBeOne() {
		Triangle triangle = new Triangle();
		assertThat(triangle.calc(0, 0), is(1));
		assertThat(triangle.calc(1, 0), is(1));
		assertThat(triangle.calc(10, 0), is(1));
	}

	@Test
	public void shouldBeOneWhenRowIsEqualToColumn() {
		Triangle triangle = new Triangle();
		assertThat(triangle.calc(0, 0), is(1));
		assertThat(triangle.calc(1, 1), is(1));
		assertThat(triangle.calc(10, 10), is(1));
	}

	@Test
	public void calculate() {
		Triangle triangle = new Triangle();
		assertThat(triangle.calc(2, 1), is(2));
		assertThat(triangle.calc(4, 1), is(4));
	}

}
