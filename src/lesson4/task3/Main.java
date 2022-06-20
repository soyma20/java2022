package lesson4.task3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ZooClub zooClub = new ZooClub();

//          first version
        Person ivan = new Person("ivan");
        Person petro = new Person("petro");
        Person dima = new Person("dima");
        Person olia = new Person("olia");
        zooClub.setPerson(ivan);
        zooClub.setPerson(petro);
        zooClub.setPerson(dima);
        zooClub.setPerson(olia);

//          second version
//        zooClub.setPerson("ivan");

        zooClub.showZooClub();


//        first version
        zooClub.addPet(ivan, "tuzic");
        zooClub.addPet(petro, "tuzic");
        zooClub.addPet(petro, "laifan");
        zooClub.addPet(dima, "barsic");
        zooClub.addPet(olia, "tuzic");
        zooClub.addPet(olia, "den");

//        second version
        zooClub.addPet(new Person("ivan"), "barsic");

        zooClub.showZooClub();

        zooClub.deletePetByPerson(ivan, new Pet("tuzic"));

        zooClub.showZooClub();

        zooClub.deletePerson(ivan);
        zooClub.showZooClub();

        zooClub.deletePetInEveryPerson(new Pet("tuzic"));
        zooClub.showZooClub();


    }

}
