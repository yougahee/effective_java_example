package chapter7.item46;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

public class CollectorFactoryy {
    public static void main(String[] args) {
        final Map<String, Long> freq1 = new HashMap<>();
        Map<String, Long> freq2;
        List<String> anagramList = Arrays.asList("staple", "apple", "aelpst", "petals", "pplea");

        // 스트림 패러다임을 이해하지 못한 코드
        // 실재로 freq가 final이 아니라면 사용할 수도 없다.
        anagramList.stream().
                forEach(word -> {
                    freq1.merge(word.toLowerCase(), 1L, Long::sum);
                });

        // ## 알맞게 변형한 코드
        freq2 = anagramList.stream()
                .collect(groupingBy(String::toLowerCase, counting()));

        //
        List<String> topTen = freq2.keySet().stream()
                .sorted(comparing(freq2::get).reversed())
                .limit(10)
                .collect(toList());
    }
}
