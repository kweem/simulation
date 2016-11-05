package be.simulation.solutions.pascal;

import static be.simulation.solutions.pascal.Calculator.factorial;

public class Triangle {

	public int calc(int row, int col) {
		if (col == 0) {
			return 1;
		}

		if (col == row) {
			return 1;
		}

		return factorial(row) / (factorial(col) * factorial(row - col));
	}

}
