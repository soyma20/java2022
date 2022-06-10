package lesson2.task3;

public class Main {
    public static void main(String[] args){
        Magazine magazine = new Magazine(true,false,true,true);
        System.out.println(magazine);

        Comics comics = new Comics(false, true, true,true);
        System.out.println(comics);
    }
}
