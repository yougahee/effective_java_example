package chapter8.item55;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;
import java.util.*;

public class OptionalTest {
    public static void main(String[] args) {
        Collection<String> words = new ArrayList<>();
        //기본 값 설정
        String lastWordInLexicon = max1(words).orElse("단어 없음...");

        //예외 던지기 - 실제예외가 아닌 예외팩터리를 던질 수 있음.
        //String toy = max1(words).orElseThrow(TemperTantrumException::new);

        //항상 값이 있다고 판단하고 .get으로 꺼내서 사용하기
        //없다면 NoSuchElementException
        //Element lastNobleGas = max1(Elements.NOBLE_GASES).get();

        System.out.println(lastWordInLexicon);


        ProcessHandle ph = ProcessHandle.current();
        Optional<ProcessHandle> parentProcess = ph.parent();
        System.out.println("부모 PID: " + (parentProcess.isPresent() ? String.valueOf(parentProcess.get().pid()) : "N/A"));

        System.out.println("부모 PID: " + parentProcess.map(h -> String.valueOf(h.pid())).orElse("N/A"));
    }

    public static <E extends Comparable<E>> E max(Collection<E> c) {
        if (c.isEmpty())
            throw new IllegalArgumentException("빈 컬렉션");

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return result;
    }

    public static <E extends Comparable<E>> Optional<E> max1(Collection<E> c) {
        if (c.isEmpty())
            return Optional.empty();

        E result = null;
        for (E e : c)
            if (result == null || e.compareTo(result) > 0)
                result = Objects.requireNonNull(e);

        return Optional.of(result);
    }

    public static <E extends Comparable<E>> Optional<E> max2(Collection<E> c) {
        return c.stream().max(Comparator.naturalOrder());
    }
}
