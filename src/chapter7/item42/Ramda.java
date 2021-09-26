package chapter7.item42;

import java.util.*;

public class Ramda {
	public static void main(String[] args) {
		List<String> words = new ArrayList<>();

		// 익명클래스
		Collections.sort(words, new Comparator<String>() {
			public int compare(String s1, String s2) {
				return Integer.compare(s1.length(), s2.length());
			}
		});

		// 람다식으로 작성
		Collections.sort(words, (s1, s2) -> Integer.compare(s1.length(), s2.length()));


		//더 간단하게
		Collections.sort(words, Comparator.comparingInt(String::length));

		words.sort(Comparator.comparingInt(String::length));
	}
}
