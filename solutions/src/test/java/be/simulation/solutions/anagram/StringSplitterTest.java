package be.simulation.solutions.anagram;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.Before;
import org.junit.Test;

public class StringSplitterTest {

	private StringSplitter splitter;

	@Before
	public void setUp() {
		this.splitter = new StringSplitter();
	}

	@Test
	public void test() {
		assertThat(splitter.splitAndSort("TeSt"), is(new char[] { 'E', 'S', 'T', 'T' }));
	}

}
