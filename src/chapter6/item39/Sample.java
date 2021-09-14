package chapter6.item39;

public class Sample {
    @MarkerAnnatation.Test
    public static void m1() {} //성공해야 함.

    public static void m2() {}

    //실패해야 함.
    @MarkerAnnatation.Test
    public static void m3() {
        throw new RuntimeException("실패");
    }

    public static void m4() {}

    // 잘못 사용한 예 : 정적 메서드가 아니다.
    @MarkerAnnatation.Test
    public void m5() {}

    public static void m6() {}

    // 실패해야 한다.
    @MarkerAnnatation.Test
    public static void m7() {
        throw new RuntimeException("실패");
    }

    public static void m8() {}
}

