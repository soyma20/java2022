package lesson4.task2;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee(1, "vasya", "dk@gmail", 20, Gender.MALE, "ksd", 10, 10);
        employee1.addSkill(new Skill("java", 2));
        employee1.addSkill(new Skill("js", 2));
        employees.add(employee1);

        Employee employee2 = new Employee(2, "petya", "bp@gmail", 25, Gender.MALE, "zaz", 30, 100);
        employee2.addSkill(new Skill("html", 4));
        employee2.addSkill(new Skill("css", 2));
        employee2.addSkill(new Skill("js", 2));
        employees.add(employee2);

        Employee employee3 = new Employee(3, "alina", "alina@gmail", 40, Gender.FEMALE, "reno", 20, 150);
        employee3.addSkill(new Skill("1C", 22));
        employee3.addSkill(new Skill("C", 22));
        employees.add(employee3);

        Employee employee4 = new Employee(4, "olichka", "olichka@gmail", 22, Gender.FEMALE, "metro", 60, 1000);
        employee4.addSkill(new Skill("html", 1));
        employee4.addSkill(new Skill("css", 1));
        employee4.addSkill(new Skill("js", 1));
        employee4.addSkill(new Skill("c", 1));
        employees.add(employee4);

        Employee employee5 = new Employee(5, "natalka", "natalka@gmail", 10, Gender.FEMALE, "velosyped", 2, 2);
        employee5.addSkill(new Skill("brehaty", 8));
        employees.add(employee5);

        Employee employee6 = new Employee(6, "ivan", "ivan@gmail", 22, Gender.MALE, "kayo", 5, 125);
        employee6.addSkill(new Skill("word", 1));
        employee6.addSkill(new Skill("word", 1));
        employee6.addSkill(new Skill("word", 1));
        employee6.addSkill(new Skill("word", 1));
        employee6.addSkill(new Skill("word", 1));
        employee6.addSkill(new Skill("word", 1));
        employees.add(employee6);

        Employee employee7 = new Employee(7, "slavik", "slavik@gmail", 21, Gender.MALE, "lada", 14, 1500);
        employee7.addSkill(new Skill("java", 1));
        employee7.addSkill(new Skill("js", 1));
        employee7.addSkill(new Skill("html", 1));
        employee7.addSkill(new Skill("css", 1));
        employee7.addSkill(new Skill("react", 1));
        employee7.addSkill(new Skill("angular", 1));
        employees.add(employee7);

        Employee employee8 = new Employee(8, "vlad", "vlad@gmail", 30, Gender.MALE, "vaz", 20, 100);
        employee8.addSkill(new Skill("mysql", 2));
        employee8.addSkill(new Skill("nodejs", 2));
        employee8.addSkill(new Skill("phyton", 2));
        employee8.addSkill(new Skill("c", 2));
        employee8.addSkill(new Skill("c", 2));
        employee8.addSkill(new Skill("c", 2));
        employee8.addSkill(new Skill("c", 2));
        employees.add(employee8);

        Employee employee9 = new Employee(9, "valik", "valik@gmail", 50, Gender.MALE, "tesla", 2, 100000);
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employee9.addSkill(new Skill("business", 30));
        employees.add(employee9);

        Employee employee10 = new Employee(10, "black mamba", "black@gmail", 2, Gender.FEMALE, "sss", 2, 1);
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employee10.addSkill(new Skill("sss", 2));
        employees.add(employee10);

        employees.forEach(System.out::println);

        employees.removeIf(employee -> employee.getGender() == Gender.MALE);

//        Iterator<Employee> iterator = employees.iterator();
//        while (iterator.hasNext()) {
//            Employee next = iterator.next();
//            if (next.getGender() == Gender.MALE) {
//                iterator.remove();
//            }
//        }
        System.out.println("-");
        employees.forEach(System.out::println);
        System.out.println("-");

        TreeSet<Employee> employeesTreeSet = new TreeSet<>();
        employeesTreeSet.add(employee1);
        employeesTreeSet.add(employee2);
        employeesTreeSet.add(employee3);
        employeesTreeSet.add(employee4);
        employeesTreeSet.add(employee5);
        employeesTreeSet.add(employee6);
        employeesTreeSet.add(employee7);
        employeesTreeSet.add(employee8);
        employeesTreeSet.add(employee9);
        employeesTreeSet.add(employee10);

        employeesTreeSet.forEach(System.out::println);

    }
}
