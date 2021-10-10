package chapter8.item49;

import java.util.Objects;

public class NonNull {
    public static void main(String[] args) {
        String strategy = null;
        strategy = Objects.requireNonNull(strategy, "전략");

        System.out.println(strategy);
    }

    public static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;

        // 실제 함수 작성
    }
}
