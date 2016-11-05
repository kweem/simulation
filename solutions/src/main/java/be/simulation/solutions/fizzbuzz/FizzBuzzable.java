package be.simulation.solutions.fizzbuzz;

public class FizzBuzzable {

	private Divider divider;
	private Handler handler;

	public FizzBuzzable(Divider divider, Handler handler) {
		this.divider = divider;
		this.handler = handler;
	}

	public boolean apply(int i) {
		return divider.apply(i);
	}

	public void handle(int i) {
		handler.handle(i);
	}

}
