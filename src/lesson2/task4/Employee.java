package lesson2.task4;

import lombok.*;

import java.util.ArrayList;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public final class Employee {
    private int id;
    private String name;
    private String surname;
    private byte age;
    private Gender gender;
    private ArrayList<Skill> skills;
    private Car car;

}
