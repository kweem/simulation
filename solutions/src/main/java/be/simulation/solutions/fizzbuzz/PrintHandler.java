package be.simulation.solutions.fizzbuzz;

public class PrintHandler implements Handler {

	private String output;

	public PrintHandler() {
	}

	public PrintHandler(String output) {
		this.output = output;
	}

	@Override
	public void handle(int i) {
		if (output == null || output.isEmpty()) {
			System.out.println(i);
		} else {
			System.out.println(output);
		}
	}

}
