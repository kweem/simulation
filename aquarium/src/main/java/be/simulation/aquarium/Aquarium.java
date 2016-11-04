package be.simulation.aquarium;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class Aquarium {

	private static final int DEFAULT_SIZE = 5;

	private final Map<Key, Integer> content = new HashMap<>();
	private final Integer maxSize;

	public Aquarium() {
		this(DEFAULT_SIZE);
	}

	public Aquarium(int maxSize) {
		this.maxSize = maxSize;
	}

	public void put(Object o) {
		synchronized (content) {
			while (content.size() >= maxSize) {
				content.remove(content.keySet().iterator().next());
			}
			final Key key = new Key(o);
			int count = content.containsKey(key) ? count(o)+1 : 1;
			content.put(key, count);
		}
	}

	public int count(Object o) {
		synchronized (content) {
			return content.get(new Key(o));
		}
	}
	
	public int size() {
		synchronized (content) {
			return content.size();
		}
	}
	
	public int getMaxSize() {
		return maxSize;
	}

	public static class Key {
		private Object k;

		public Key(Object k) {
			this.k = k;
		}
		
		public String toString() {
			return k.toString();
		}
	}

}
