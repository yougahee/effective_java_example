package chapter5.varargs;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Varargs {
	/*static void dangerous(List<String>... stringList) {
		List<Integer> intList = List.of(42);
		Object[] objects = stringList;
		objects[0] = intList; //힙 오염 발생
		String s = stringList[0].get(0);
	}*/

	static <T> T[] toArray(T... args) {
		return args;
	}

	static <T> T[] pickTwo(T a, T b, T c) {
		switch(ThreadLocalRandom.current().nextInt(3)) {
			case 0: return toArray(a, b);
			case 1: return toArray(a, c);
			case 2: return toArray(b, c);
		}
		throw new AssertionError();
	}

	public static void main(String[] args) {
		//ClassCastException
		String[] attributes = pickTwo("좋은", "빠른", "저렴한");

	}
}
