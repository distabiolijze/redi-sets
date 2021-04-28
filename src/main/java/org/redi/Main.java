package org.redi;

public class Main {
    public static void main(String[] args) {
        SortedSet<Integer> ourSet = new MySortedSet<>();
        ourSet.add(12);
        ourSet.add(10);
        ourSet.add(10);
        ourSet.add(10);
        ourSet.add(10);
        ourSet.add(10);
        ourSet.add(11);
        ourSet.add(9);
        ourSet.add(8);
        ourSet.add(1);

        System.out.println("-------");
        ourSet.forEach(System.out::println);
        System.out.println("-------");

        SortedSet<Integer> subset = ourSet.subset(8, 11);
        subset.forEach(System.out::println);
        System.out.println("-------");
        System.out.println(ourSet.first());
        System.out.println("-------");
        System.out.println(ourSet.last());


    }
}
