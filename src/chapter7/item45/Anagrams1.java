package chapter7.item45;

import java.util.*;

public class Anagrams {
    public static void main(String[] args) {
        List<String> anagramList = Arrays.asList("staple", "apple", "aelpst", "petals", "pplea");

        Map<String, Set<String>> groups = new HashMap<>();

        for (String anagram : anagramList) {
            groups.computeIfAbsent(alphabetize(anagram),
                    (unused) -> new TreeSet<>()).add(anagram);
        }

        for(Set<String> group : groups.values())
            if (group.size() >= 1)
                System.out.println(group.size() + ": " + group);
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
