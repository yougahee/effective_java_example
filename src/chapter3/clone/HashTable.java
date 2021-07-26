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

		Entry deepCopy() {
			Entry result = new Entry(key, value, next);
			for (Entry p = result; p.next != null; p = p.next)
				p.next = new Entry(p.next.key, p.next.value, p.next.next);
			return result;
		}
	}

	//문제가 일어날 수도 있음.
	/*@Override
	public HashTable clone() {
		try {
			HashTable result = (HashTable) super.clone();
			result.buckets = buckets.clone();
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}*/

	//재귀호출을 통해 오버플로가 발생할 수 있다.
	@Override
	public HashTable clone() {
		try {
			HashTable result = (HashTable) super.clone();
			result.buckets = new Entry[buckets.length];
			for(int i=0; i<buckets.length; i++) {
				if(buckets[i] != null)
					result.buckets[i] = buckets[i].deepCopy();
			}

			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
}
