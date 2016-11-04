package be.simulation.solutions.anagram;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StringCleanerTest {

	private StringCleaner cleaner;

	@Before
	public void setUp() {
		this.cleaner = new StringCleaner();
	}

	@Test
	public void test() {
		assertThat(cleaner.clean("test123"), is("TEST123"));
		assertThat(cleaner.clean("t E s t"), is("TEST"));
		assertThat(cleaner.clean("test'!.&é\"'(§è!çà)-$test"), is("TESTTEST"));
	}

}
