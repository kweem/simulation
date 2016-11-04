package be.simulation.solutions.anagram;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class AnagramDetectorTest {

	private AnagramDetector detector;

	@Before
	public void setUp() {
		this.detector = new AnagramDetector();
	}

	@Test
	public void test() {
		assertThat(detector.detect("night", "thing"), is(true));
		assertThat(detector.detect("schoolmaster", "the classroom"), is(true));
		assertThat(detector.detect("a telephone girl", "repeating 'hello'"), is(true));
	}

}
