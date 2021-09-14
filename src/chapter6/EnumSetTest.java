package chapter6;

import java.util.EnumSet;
import java.util.Set;

public class EnumSetTest {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    public void applyStyles(Set<Style> styleSet) { }

    public static void main(String[] args) {
        EnumSetTest enumSetTest = new EnumSetTest();
        enumSetTest.applyStyles(EnumSet.of(Style.BOLD, Style.UNDERLINE));
    }
}
