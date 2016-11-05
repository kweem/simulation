package be.simulation.solutions.fizzbuzz;

public class Divider {

	private int[] dividers;

	public Divider(int... dividers) {
		this.dividers = dividers;
	}

	public boolean apply(int i) {
		for (int d : dividers) {
			if (i % d != 0) {
				return false;
			}
		}
		return true;
	}

}
