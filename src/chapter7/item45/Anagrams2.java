package chapter7.item45;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

// 스트림 과다 사용 - 읽기 및 유지보수가 어렵다.
public class Anagrams2 {
    public static void main(String[] args) {
        List<String> anagramList = Arrays.asList("staple", "apple", "aelpst", "petals", "pplea");

        anagramList.stream().collect(
                groupingBy(word -> word.chars().sorted()
                        .collect(StringBuilder::new,
                                (sb, c) -> sb.append((char) c),
                                StringBuilder::append).toString())
        ).values().stream()
                .filter(group -> group.size() >= 2)
                .map(group -> group.size() + ": " + group)
                .forEach(System.out::println);
    }
}
