package be.simulation.solutions.pascal;

public class Pascal {

	private Handler handler;

	public static void main(String... args) {
		new Pascal(new PrintHandler()).triangle(5);
	}

	public Pascal(Handler handler) {
		this.handler = handler;
	}

	public void triangle(int numberOfRows) {
		Triangle triangle = new Triangle();
		for (int row = 0; row < numberOfRows; row++) {
			for (int col = 0; col < row + 1; col++) {
				handler.execute(triangle.calc(row, col));
			}
			handler.execute();
		}
	}

}
