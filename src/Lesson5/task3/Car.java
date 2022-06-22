package Lesson5.task3;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Car {
    private String brand;
    private int powerOfEngine;
    private Owner owner;
    private int price;
    private int year;

    public Car(String brand, int powerOfEngine, String name, int age, int experience, int price, int year) {
        this.brand = brand;
        this.powerOfEngine = powerOfEngine;
        this.price = price;
        this.owner = new Owner(name, age, experience);
        this.year = year;
    }

    public Car(int price) {
        this.price = price;
    }
}
