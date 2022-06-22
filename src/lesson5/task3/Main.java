package lesson5.task3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        ArrayList<Car> cars = new ArrayList<>();
        cars.add(new Car("tesla", 1000, "ivan", 20, 2, 1000, 2000));
        cars.add(new Car("zaz", 500, "natalka", 26, 0, 100, 1989));
        cars.add(new Car("lada", 800, "batya", 57, 30, 800, 2007));
        cars.add(new Car("bmw", 1000, "olichka", 22, 0, 1000, 2022));
        cars.add(new Car("mazda", 800, "damir", 60, 4, 800, 2012));
        cars.add(new Car("land rower", 1000, "vlad", 26, 2, 950, 2020));
        cars.add(new Car("reno", 600, "maria", 40, 10, 500, 2010));
        cars.add(new Car("volga", 500, "volodya", 30, 8, 200, 1985));


        List<Car> collect = cars.stream().limit(4).map(car -> {
            int onePercent = car.getPowerOfEngine() / 100;
            int newPowerOfEngine = onePercent * 110;
            car.setPowerOfEngine(newPowerOfEngine);
            return car;
        }).collect(Collectors.toList());

        List<Car> secondHalfOfCars = cars.stream().skip(4).collect(Collectors.toList());
        collect.addAll(secondHalfOfCars);

        collect.stream().map(car -> {
            if (car.getOwner().getExperience() < 5 && car.getOwner().getAge() > 25) {
                int newExp = car.getOwner().getExperience() + 1;
                car.getOwner().setExperience(newExp);
            }
            return car;
        }).forEach(System.out::println);


        Car reduce = collect.stream().reduce(new Car(), (acumulator, value) -> {
            int total = acumulator.getPrice() + value.getPrice();
            return new Car(total);
        });

        System.out.println(reduce);


    }
}
