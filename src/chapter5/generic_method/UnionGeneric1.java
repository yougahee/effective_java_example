package chapter5.generic_method;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class UnionGeneric1 {
	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet(s1);
		result.addAll(s2);
		return result;
	}
}
