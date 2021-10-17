package chapter8.item50;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date start = new Date();
        Date end = new Date();
        Period1 p = new Period1(start, end);
        //end.setYear(78);

        //2번째 공격
        Period2 p2 = new Period2(start, end);
        //p2.getEnd().setYear(78);

        //
        Period3 p3 = new Period3(start, end);
        //p3.getEnd().setTime(89);
    }
}
