package lesson4.task1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new LinkedList<>();
        users.add( new User(55,"chilick"));
        users.add( new User(25,"makaka"));
        users.add( new User(20,"mamba"));
        users.add( new User(29,"kaka"));
        users.add( new User(37,"draka"));

//        System.out.println(users);
        users.sort((Comparator.comparingInt(User::getAge)));
//        System.out.println(users);
        users.sort(((o1, o2) ->  o2.getAge() - o1.getAge()));
//        System.out.println(users);

        ArrayList<String> words = new ArrayList<>();
        words.add("name");
        words.add("banana");
        words.add("tomato");
        words.add("potato");
        words.add("laptop");
        words.add("pc");
        words.add("mouse");
        words.add("phone");
        words.add("headphones");
        words.add("glass");
        words.add("pillow");
        words.add("pill");
        words.add("switch");
        words.add("charger");
        words.add("gas");
        words.add("car");
        words.add("cat");
        words.add("camera");
        words.add("plug");
        words.add("chair");
        words.add("dog");
        words.add("human");
        System.out.println(words);
        words.sort(String::compareTo);
        System.out.println(words);

    }
}
