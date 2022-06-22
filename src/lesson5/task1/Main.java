package lesson5.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("word");
        strings.add("tomato");
        strings.add("potato");
        strings.add("pen");
        strings.add("laptop");
        strings.add("pc");
        strings.add("tv");
        strings.add("socket");
        strings.add("plug");
        strings.add("window");
        strings.add("screen");
        strings.add("chair");
        strings.add("spy");
        strings.add("water");
        strings.add("earth");
        strings.add("door");
        strings.add("dream");
        strings.add("tree");
        strings.add("three");
        strings.add("cow");
        strings.add("coffee");

        strings.stream().filter(s -> s.length() < 4).sorted(String::compareTo).forEach(System.out::println);;




    }
}
