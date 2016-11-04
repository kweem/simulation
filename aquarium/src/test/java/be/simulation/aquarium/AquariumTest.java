package be.simulation.aquarium;

import org.junit.Test;

import be.simulation.aquarium.Aquarium;
import be.simulation.aquarium.Color;
import be.simulation.aquarium.Fish;
import junit.framework.TestCase;

public class AquariumTest extends TestCase {

	@Test
	public void test1() {
		Aquarium aquarium = new Aquarium();
		aquarium.put(new Fish(Color.BLACK));
		aquarium.put(new Fish(Color.BLACK));
		aquarium.put(new Fish(Color.BLACK));
		
		assertEquals(3, aquarium.count(new Fish(Color.BLACK)));
	}
	
	@Test
	public void test2() {
		Aquarium aquarium = new Aquarium();
		aquarium.put(new Fish(Color.GREEN));	
		aquarium.put(new Fish(Color.WHITE));
		
		assertEquals(0, aquarium.count(new Fish(Color.RED)));
	}
	
	@Test
	public void test3() {
		final int size = 2;
		Aquarium aquarium = new Aquarium(size);
		aquarium.put(new Fish(Color.BLUE));		
		aquarium.put(new Fish(Color.BROWN));
		aquarium.put(new Fish(Color.PURPLE));
		
		assertEquals(size, aquarium.getMaxSize());
		assertEquals(size, aquarium.size());
		assertEquals(0, aquarium.count(new Fish(Color.BLUE)));
		assertEquals(1, aquarium.count(new Fish(Color.BROWN)));
		assertEquals(2, aquarium.count(new Fish(Color.PURPLE)));
	}
	
}
