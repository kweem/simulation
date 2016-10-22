package be.simulation.aquarium;

import java.util.HashMap;
import java.util.Map;

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
			content.put(new Key(o), count(o)+1);
		}
	}

	public Integer count(Object o) {
		synchronized (content) {
			Integer value = content.get(new Key(o));
			return value == null ? 0 : value;
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

//		@Override
//	    public boolean equals(Object o) {
//	      if (this == o) return true;
//	      if (o == null || getClass() != o.getClass()) return false;
//	      return k.equals(((Key) o).k);
//	    }
//
//	    @Override
//	    public int hashCode() {
//	      return k.hashCode();
//	    }
		
	}

}
