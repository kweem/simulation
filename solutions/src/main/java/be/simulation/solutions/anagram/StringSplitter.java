package be.simulation.solutions.anagram;

import java.util.Arrays;

public class StringSplitter {

	public char[] splitAndSort(String s) {
		char[] array = s.toUpperCase().toCharArray();
		Arrays.sort(array);
		return array;
	}

}
