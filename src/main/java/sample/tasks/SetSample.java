package sample.tasks;

import sample.model.Car;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

    private Set<Car> cars = new HashSet<>();

    public SetSample() {
        cars.add(new Car("BMW", 230));
        cars.add(new Car("Audi", 290));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("BMW", 230));
        cars.add(new Car("Audi", 290));
        cars.add(new Car("Bugatti", 890));
    }

    public Set<Car> getCars() {
        return cars;
    }
}
