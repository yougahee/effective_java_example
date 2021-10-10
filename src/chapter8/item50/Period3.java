package chapter8.item50;

import java.util.Date;

public class Period3 {
    private final Date start;
    private final Date end;

    /*
    * @param start 시작 시간
    * @prarm end 종료 시간; 시작 시간보다 뒤여야 한다.
    * @throws IllegalArgumentException 시작 시각이 종료 시각보다 늦을 때 발생한다.
    */
    Period3(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if(this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(
                    start + "가 " + end + "보다 늦다.");
    }

    public Date getStart() {
        return new Date(start.getTime());
    }
    public Date getEnd() {
        return new Date(start.getTime());
    }
}
