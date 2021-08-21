package chapter5;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LawExample {

	public static void main(String[] args) {
		List<String> strings = new ArrayList<>();

		unsafeAdd(strings, Integer.valueOf(42));
		String s = strings.get(0);
	}

	private static void unsafeAdd(List list, Object o) {
		list.add(o);
	}

	static int numElementsInCommon(Set<?> s1, Set<?> s2) {
		return s1.size() + s2.size();
	}
}
