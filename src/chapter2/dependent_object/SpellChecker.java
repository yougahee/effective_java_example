package chapter2.dependent_object;

import java.util.LinkedList;
import java.util.List;

// 정적 유틸리티 잘못 사용한 예
public class SpellChecker {
	private static final Lexicon dictionary = new NoriDictionary();
	//객체 생성 방지
	private SpellChecker() {}

	public static boolean isValid(String word) {
		return Boolean.parseBoolean(word);
	}

	public static List<String> suggestions(String typo) {
		List<String> result = new LinkedList<>();
		result.add(typo);
		return result;
	}
}
interface Lexicon {}

class NoriDictionary implements Lexicon {}