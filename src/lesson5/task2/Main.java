package lesson5.task2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] ints = new Integer[20];
        ints[0] = 0;
        ints[1] = 123;
        ints[2] = 21;
        ints[3] = 32;
        ints[4] = 453;
        ints[5] = 2;
        ints[6] = 1;
        ints[7] = 8890;
        ints[8] = 47;
        ints[9] = -45;
        ints[10] = -23;
        ints[11] = 3284;
        ints[12] = 48;
        ints[13] = 18;
        ints[14] = 19;
        ints[15] = 432;
        ints[16] = 90;
        ints[17] = -1;
        ints[18] = 398;
        ints[19] = 404;

//        Arrays.stream(ints).sorted((o1, o2) -> o1 - o2).forEach(System.out::println);
//        Arrays.stream(ints).filter(integer -> integer % 3 == 0).forEach(System.out::println);
//        Arrays.stream(ints).filter(integer -> integer % 10 == 0).forEach(System.out::println);
//        Arrays.stream(ints).map(integer -> integer*3).forEach(System.out::println);

        Arrays.stream(ints)
                .sorted((o1, o2) -> o1 - o2)
                .filter(integer -> integer % 3 == 0)
                .filter(integer -> integer % 10 == 0)
                .map(integer -> integer * 3)
                .forEach(System.out::println);
    }
}
