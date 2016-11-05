package be.simulation.solutions.fizzbuzz;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	private List<FizzBuzzable> fizzbuzzables;
	private int max;

	public static void main(String... args) {
		List<FizzBuzzable> fizzbuzzables = new ArrayList<>();

		fizzbuzzables.add(new FizzBuzzable(new Divider(3, 5), new PrintHandler("FizzBuzz")));
		fizzbuzzables.add(new FizzBuzzable(new Divider(3), new PrintHandler("Fizz")));
		fizzbuzzables.add(new FizzBuzzable(new Divider(5), new PrintHandler("Buzz")));
		fizzbuzzables.add(new FizzBuzzable(new Divider(1), new PrintHandler()));

		new FizzBuzz(100, fizzbuzzables).run();
	}

	public FizzBuzz(int max, List<FizzBuzzable> fizzbuzzables) {
		this.fizzbuzzables = fizzbuzzables;
		this.max = max;
	}

	public void run() {
		for (int i = 1; i < max + 1; i++) {
			FizzBuzzable fb = findFizzBuzzable(i);
			if (fb != null) {
				fb.handle(i);
			}
		}
	}

	private FizzBuzzable findFizzBuzzable(int i) {
		for (FizzBuzzable fb : fizzbuzzables) {
			if (fb.apply(i)) {
				return fb;
			}
		}
		return null;
	}

}
