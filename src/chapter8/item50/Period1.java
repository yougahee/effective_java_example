package chapter8.item50;

import java.util.Date;

public class Period1 {
    private final Date start;
    private final Date end;

    /*
    * @param start 시작 시간
    * @prarm end 종료 시간; 시작 시간보다 뒤여야 한다.
    * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
    */
    Period1(Date start, Date end) {
        if(start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + "가 " + end + "보다 늦다.");
        this.start = start;
        this.end = end;
    }

    public Date getStart() {
        return start;
    }

    public Date getEnd() {
        return end;
    }
}
