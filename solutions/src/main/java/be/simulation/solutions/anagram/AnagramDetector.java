package be.simulation.solutions.anagram;

import java.util.Arrays;

public class AnagramDetector {

	public boolean detect(String s1, String s2) {
		StringCleaner cleaner = new StringCleaner();
		StringSplitter splitter = new StringSplitter();

		final char[] array1 = splitter.splitAndSort(cleaner.clean(s1));
		final char[] array2 = splitter.splitAndSort(cleaner.clean(s2));

		return Arrays.equals(array1, array2);

	}

}
