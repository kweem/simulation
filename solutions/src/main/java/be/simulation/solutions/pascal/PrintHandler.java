package be.simulation.solutions.pascal;

public class PrintHandler implements Handler {

	@Override
	public void execute(int i) {
		System.out.print(i + " ");
	}

	@Override
	public void execute() {
		System.out.println();
	}

}
