package sample.tasks;

import sample.model.Car;

import java.util.*;

public class SetSample {

    private Set<Car> cars = new TreeSet<>();

    public SetSample() {
        cars.add(new Car("BMW", 230));
        cars.add(new Car("Audi", 290));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("Lexus", 254));
        cars.add(new Car("Honda", 140));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("BMW", 230));
        cars.add(new Car("Audi", 290));
        cars.add(new Car("Mitsubishi", 198));
        cars.add(new Car("Bugatti", 890));
        cars.add(new Car("BMW", 230));
        cars.add(new Car("Audi", 290));
        cars.add(new Car("Bugatti", 890));
    }

    public Set<Car> getCars() {
        return cars;
    }

    public void showMembers () {
        Iterator iter = cars.iterator();

        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    
}
