package lesson3.task1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Printable> printable = new ArrayList<>();
        printable.add(new Book());
        printable.add(new Magazine());
        printable.add(new Magazine());
        printable.add(new Magazine());
        System.out.println(printable);

    }
}
