package sample;

import sample.commons.PerformanceTester;
import sample.model.Car;
import sample.tasks.ArrayListSample;
import sample.tasks.LinkedListSample;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

         List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            cars.add(new Car("BMW" + i, 230));
            cars.add(new Car("Audi" + i , 290));
            cars.add(new Car("Bugatti" + i, 890));
        }

        /*ArrayList*/
        System.out.println("\n ArrayList example: ");
        ArrayListSample arrayListSample = new ArrayListSample();

      //  arrayListSample.getIndexes();

     //   arrayListSample.getCars();

        arrayListSample.deleteCar("BMW400");

     //   arrayListSample.getCars();

      //  arrayListSample.getIndexes();

     //   arrayListSample.getSizeList();

        arrayListSample.changeCarBrand("Bugatti", "Lamburgini");

        arrayListSample.getCar();


        /*LinkedList*/
        System.out.println(" \n LinkedList example:");
        LinkedListSample linkedListSample = new LinkedListSample();

     //   linkedListSample.getIndexes();

     //   linkedListSample.getCars();

        linkedListSample.deleteCar("BMW400");

     //   linkedListSample.getCars();

     //   linkedListSample.getIndexes();

     //   linkedListSample.getSizeList();

        linkedListSample.changeCarBrand("Bugatti", "Lamburgini");

        linkedListSample.getCar();


        PerformanceTester<Car> tester = new PerformanceTester<>(Car.class);
        tester.readTest(cars, 1000);
     //   tester.writeTest(new ArrayList<>(), 10000);
      //  tester.writeTest(new LinkedList<>(), 10000);
    }


}
