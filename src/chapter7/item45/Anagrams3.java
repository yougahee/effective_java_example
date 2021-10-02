package chapter7.item45;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Anagrams3 {
    public static void main(String[] args) {
        List<String> anagramList = Arrays.asList("staple", "apple", "aelpst", "petals", "pplea");

        anagramList.stream().collect(groupingBy(Anagrams3::alphabetize))
                .values().stream()
                .filter(group -> group.size() >= 1)
                .forEach(group-> System.out.println(group.size() + ": " + group));
    }

    private static String alphabetize(String s) {
        char[] a = s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}
