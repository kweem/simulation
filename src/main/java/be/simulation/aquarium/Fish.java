package be.simulation.aquarium;

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
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      return color.equals(((Fish)o).getColor());
    }

    @Override
    public int hashCode() {
      return color.hashCode();
    }

}
