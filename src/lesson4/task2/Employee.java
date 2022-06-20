package lesson4.task2;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;

    public Employee(int id, String name, String email, int age, Gender gender, String model, int year, int power) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;


        this.car = new Car(model,year,power);
    }
    public void addSkill(Skill skill){
        this.skills.add(skill);
    }

    @Override
    public int compareTo(Employee o) {
        return this.skills.size()-o.skills.size();
    }
}
