package be.simulation.aquarium;

import org.junit.Test;

import be.simulation.aquarium.Aquarium;
import be.simulation.aquarium.Color;
import be.simulation.aquarium.Fish;
import junit.framework.TestCase;

public class AquariumTest extends TestCase {

	private static final int AQUARIUM_SIZE = 2;

	@Test
	public void test1() {
		Aquarium aquarium = new Aquarium();
		aquarium.put(new Fish(Color.BLACK));
		aquarium.put(new Fish(Color.BLACK));
		aquarium.put(new Fish(Color.BLACK));
		
		assertEquals(new Integer(3), aquarium.count(new Fish(Color.BLACK)));
	}
	
	@Test
	public void test2() {
		Aquarium aquarium = new Aquarium(AQUARIUM_SIZE);
		aquarium.put(new Fish(Color.BLUE));		
		aquarium.put(new Fish(Color.BROWN));
		aquarium.put(new Fish(Color.PURPLE));
		
		assertEquals(aquarium.getMaxSize(), aquarium.size());
		assertEquals(new Integer(0), aquarium.count(new Fish(Color.BLUE)));
		assertEquals(new Integer(1), aquarium.count(new Fish(Color.BROWN)));
		assertEquals(new Integer(2), aquarium.count(new Fish(Color.PURPLE)));
	}
	
}
