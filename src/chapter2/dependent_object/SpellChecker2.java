package chapter2.dependent_object;

import java.util.LinkedList;
import java.util.List;

public class SpellChecker2 {
	private static final Lexicon dictionary = new NoriDictionary();
	//객체 생성 방지
	private SpellChecker2() {}
	private static SpellChecker2 INSTANCE = new SpellChecker2();

	public static boolean isValid(String word) {
		return Boolean.parseBoolean(word);
	}

	public static List<String> suggestions(String typo) {
		List<String> result = new LinkedList<>();
		result.add(typo);
		return result;
	}
}
