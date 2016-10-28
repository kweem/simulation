package be.simulation.aquarium;

import java.util.Objects;

public class Fish {

	private Color color;

	public Fish(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public String toString() {
		return "I'm a " + color.name().toLowerCase() + " fish.";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o instanceof Fish) {
			return Objects.equals(color, ((Fish)o).color);
		}
		return false;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(color);
	}

}
