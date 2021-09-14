package chapter6.item39;

public class Sample2 {
    @MarkerAnnatation.ExceptionTest(ArithmeticException.class)
    public static void m1(){
        int i=0;
        i = i/1;
    }

    // 실패 -> 다른 예외 발셍
    @MarkerAnnatation.ExceptionTest(ArithmeticException.class)
    public static void m2(){
        int[] a = new int[0];
        int i = a[1];
    }

    // 실패 - 예외가 발생하지 않음
    @MarkerAnnatation.ExceptionTest(ArithmeticException.class)
    public static void m3(){ }
}
