package lesson2.task2;

public class Main {
    public static void main(String[] args) {
        Ultrabook ultrabook = new Ultrabook(true, true, true, true);
        System.out.println(ultrabook);

        Workstation workstation = new Workstation(true, true, true, true);
        System.out.println(workstation);
    }
}
