package sample.tasks;

import sample.model.Car;

import java.util.*;

public class ArrayListSample {

    private List<Car> cars = new ArrayList<>();

    public ArrayListSample() {

        int counter = 500;
        for (int i = 0; i < counter; i++) {
            this.cars.add(new Car("BMW" + counter, 230));
            this.cars.add(new Car("Audi" + counter , 290));
            this.cars.add(new Car("Bugatti" + counter, 890));
        }

    }

    public void getCars() {
        System.out.println(cars);
    }

    public void getCar(int index) {
        long time = System.nanoTime();
     //   System.out.println(cars.get(index));
        System.out.println("time to get : " + (System.nanoTime() - time));
    }

    public void getIndexes() {
        for (Car car: cars) {
            System.out.println(cars.indexOf(car));
        }
    }

    public void getSizeList() {
        System.out.println("Size" + cars.size());
    }

    public void deleteCar(String value) {

        //example 1
        long time = System.nanoTime();
        cars.removeIf( car -> car.getBrand().equals(value));
        System.out.println("time delete : " + (System.nanoTime() - time));

        //example 2
        for (int i = 0; i < cars.size(); i++) {
            if (cars.get(i).getBrand().equals(value)) {
                cars.remove(cars.remove(i));
            }
        }

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
