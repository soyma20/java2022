package lesson4.task2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("ksd", 10, 10);
        User user = new User(1, "vasya", "dk@gmail", 20, Gender.MALE, car);



        user.addSkill(new Skill("java",2));
        System.out.println(user);



    }
}
