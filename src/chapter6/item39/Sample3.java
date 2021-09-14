package chapter6.item39;

import java.util.ArrayList;
import java.util.List;

public class Sample3 {
    @MarkerAnnatation.ExceptionArrayTest({
            IndexOutOfBoundsException.class,
            NullPointerException.class
    })
    public static void m1(){
        List<String> list = new ArrayList<>();

        list.addAll(5, null);
    }
}
