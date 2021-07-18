package chapter2.dependent_object;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class SpellChecker3 {
	private final Lexicon dictionary;
	public SpellChecker3(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public static boolean isValid(String word) {
		return Boolean.parseBoolean(word);
	}

	public static List<String> suggestions(String typo) {
		List<String> result = new LinkedList<>();
		result.add(typo);
		return result;
	}
}
