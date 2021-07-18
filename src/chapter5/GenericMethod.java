package chapter5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class GenericMethod {

	public static <E> Set<E> union(Set<E> s1, Set<E> s2) {
		Set<E> result = new HashSet<>(s1);
		result.addAll(s2);
		return result;
	}

	// 로 타입은 되도록이면 쓰지 말자.
	// 이렇게 쓰면 안되는 경우
	public static Set union1(Set s1, Set s2) {
		Set result = new HashSet(s1);
		result.addAll(s2);
		
		return result;
	}

	public static void main(String[] args) {
		Set<String> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		set1.add("rkrkrk");
		set2.add(1);
		System.out.println(union1(set1, set2));
	}
}
