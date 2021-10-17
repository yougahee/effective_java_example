package chapter8.item53;

public class Varargs {

    static int sum(int... args) {
        int sum = 0;
        for(int arg : args)
            sum += arg;
        return sum;
    }

    // 인수를 1개 이상 받는 메소드 - 잘못 구현한 예
    static int min(int... args) {
        if(args.length == 0)
            throw new IllegalArgumentException("인수가 1개 이상 필요합니다.");

        int min = args[0];
        for(int i = 1; i < args.length; i++)
            if(args[i] < min)
                min = args[i];
            return min;
    }

    // 인수를 1개 이상 - 잘 구현한 예
    static int rightMin(int firstArg, int... remainingArgs) {
        int min = firstArg;
        for(int arg : remainingArgs)
            if(arg < min)
                min = arg;
            return min;
    }

    public void foo() {}
    public void foo(int a1) {}
    public void foo(int a1, int a2) {}
    public void foo(int a1, int a2, int a3) {}
    public void foo(int a1, int a2, int a3, int... rest) {}


}
