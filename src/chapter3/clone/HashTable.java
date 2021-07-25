package chapter3.clone;

import java.util.HashMap;

public class HashTable implements Cloneable {
	private Entry[] buckets = new Entry[3];

	private static class Entry {
		final Object key;
		Object value;
		Entry next;

		Entry(Object key, Object value, Entry next) {
			this.key = key;
			this.value = value;
			this.next = next;
		}
	}

	@Override
	public HashTable clone() {
		try {
			HashTable result = (HashTable) super.clone();
			result.buckets = buckets.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
