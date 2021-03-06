package sample.tasks;

import sample.model.Car;

import java.util.LinkedList;
import java.util.List;

public class LinkedListSample {

    private List<Car> cars = new LinkedList<>();

    public LinkedListSample() {
        int counter = 2000;
        for (int i = 0; i < counter; i++) {
            this.cars.add(new Car("BMW" + counter, 230));
            this.cars.add(new Car("Audi" + counter , 290));
            this.cars.add(new Car("Bugatti" + counter, 890));
        }
    }

    public void getCars() {
        System.out.println(cars);
    }

    public void getCar() {
        long time = System.nanoTime();

     //   System.out.println(cars.get(index));

        cars.get(24);
        cars.get(138);
        cars.get(10);

        System.out.println("time to get : " + (System.nanoTime() - time));
    }

    public void getSizeList() {
        System.out.println("Size" + cars.size());

    }

    public void getIndexes() {
        for (Car car: cars) {
            System.out.println(cars.indexOf(car));
        }
    }

    public void deleteCar(String value) {

        //example 1
        long time = System.nanoTime();
          cars.removeIf( car -> car.getBrand().equals(value));
        System.out.println("time delete : " + (System.nanoTime() - time));

        //example 2
//        for (int i = 0; i < cars.size(); i++) {
//            if (cars.get(i).getBrand().equals(value)) {
//                cars.remove(cars.remove(i));
//            }
//        }

    }

    public void changeCarBrand(String value, String newValue) {

        long time = System.nanoTime();
        cars.forEach( car -> {
            if(car.getBrand().equals(value)) {
                car.setBrand(newValue);
            }
        });
        System.out.println("time change brand: " + (System.nanoTime() - time));
    }
}
