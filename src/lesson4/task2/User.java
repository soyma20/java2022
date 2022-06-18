package lesson4.task2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private Gender gender;
    private ArrayList<Skill> skills = new ArrayList<>();
    private Car car;

    public User(int id, String name, String email, int age, Gender gender, Car car) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.gender = gender;
        this.car = car;
    }
    public void addSkill(Skill skill){
        this.skills.add(skill);
    }
}
