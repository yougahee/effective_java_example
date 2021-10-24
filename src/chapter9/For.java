package chapter9;

import javax.lang.model.element.Element;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class For {
    public static void main(String[] args) {
        Collection<Element> c = new ArrayList<>();
        //컬렉션이나 배열을 순회하는 권장 관용구
        for (Element e : c) {
            //e로 무언가 하는 코드
        }

        //반복자가 필요할 때
        for(Iterator<Element> i = c.iterator(); i.hasNext();) {
            Element e = i.next();
        }


        //while문 - i가 죽지 않아서 오타가 나도 잡아줄 수 있는 방법이 없다.
        Iterator<Element> i = c.iterator();
        while (i.hasNext()) {
            doSomthing(i.next());
        }

        Iterator<Element> i2 = c.iterator();
        while (i.hasNext()) {
            doSomethingElse(i2.next());
        }
    }

    public static void doSomthing(Element e) { }

    public static void doSomethingElse(Element e) { }
}
