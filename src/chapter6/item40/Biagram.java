package chapter6.item40;

import java.util.HashSet;
import java.util.Set;

public class Biagram {
    private final char first;
    private final char second;

    Biagram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Biagram))
            return false;
        Biagram biagram = (Biagram) o;
        return biagram.first == this.first && biagram.second == this.second;
    }

    @Override
    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Biagram> set = new HashSet<>();

        for(int i=0; i<10; i++) {
            for(char j = 'a'; j <= 'z'; j++) {
                set.add(new Biagram(j,j));
            }
        }

        System.out.println("Set의 사이즈 :  "+ set.size());
    }
}
