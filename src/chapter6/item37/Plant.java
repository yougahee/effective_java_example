package chapter6.item37;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;

public class Plant {
    enum LifeCycle { ANNUAL, PERENNIAL, BIENNIAL }

    final String name;
    final LifeCycle lifeCycle;

    Plant(String name, LifeCycle lifeCycle) {
        this.name = name;
        this.lifeCycle = lifeCycle;
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Set<Plant>[] plantsByLifeCycle = (Set<Plant>[]) new Set[LifeCycle.values().length];
        List<Plant> garden = new ArrayList<>();
        garden.add(new Plant("aa", LifeCycle.ANNUAL));
        garden.add(new Plant("안개꽃", LifeCycle.BIENNIAL));

        for (int i=0; i<plantsByLifeCycle.length; i++) {
            plantsByLifeCycle[i] = new HashSet<>();
        }

        Map<LifeCycle, Set<Plant>> plantsByLifeCycle1 = new EnumMap<>(Plant.LifeCycle.class);

        for (Plant.LifeCycle lc : Plant.LifeCycle.values())
            plantsByLifeCycle1.put(lc, new HashSet<>());
        for(Plant p : garden)
            plantsByLifeCycle1.get(p.lifeCycle).add(p);
        System.out.println(plantsByLifeCycle);
    }
}
