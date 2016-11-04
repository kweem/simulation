package be.simulation.solutions.anagram;

public class StringCleaner {

	public String clean(String s) {
		return s.replaceAll("[^a-zA-Z1-9]", "").toUpperCase();
	}

}
