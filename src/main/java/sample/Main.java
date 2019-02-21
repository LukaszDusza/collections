package sample;

import sample.exercise.Exercises;
import sample.model.Car;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

         List<Car> cars = new ArrayList<>();

        for (int i = 0; i < 2000; i++) {
            cars.add(new Car("BMW" + i, 230));
            cars.add(new Car("Audi" + i , 290));
            cars.add(new Car("Bugatti" + i, 890));
        }

        /*ArrayList*/
     //   System.out.println("\n ArrayList example: ");
    //    ArrayListSample arrayListSample = new ArrayListSample();

      //  arrayListSample.getIndexes();

     //   arrayListSample.getCars();

     //   arrayListSample.deleteCar("BMW400");

     //   arrayListSample.getCars();

      //  arrayListSample.getIndexes();

     //   arrayListSample.getSizeList();

     //   arrayListSample.changeCarBrand("Bugatti", "Lamburgini");

     //   arrayListSample.getCar();


        /*LinkedList*/
      //  System.out.println(" \n LinkedList example:");
     //   LinkedListSample linkedListSample = new LinkedListSample();

     //   linkedListSample.getIndexes();

     //   linkedListSample.getCars();

     //   linkedListSample.deleteCar("BMW400");

     //   linkedListSample.getCars();

     //   linkedListSample.getIndexes();

     //   linkedListSample.getSizeList();

      //  linkedListSample.changeCarBrand("Bugatti", "Lamburgini");

      //  linkedListSample.getCar();


      //  PerformanceTester<Car> tester = new PerformanceTester<>(Car.class);
     //   tester.readTest(cars, 1000);
     //   tester.writeTest(new ArrayList<>(), 10000);
      //  tester.writeTest(new LinkedList<>(), 10000);

     //   SetSample setSample = new SetSample();
      //  System.out.println(setSample.getCars());

     //   setSample.showMembers();

        Exercises exercises = new Exercises();
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(12);
        numbers.add(2);
        numbers.add(10);
        numbers.add(30);
        numbers.add(24);
        numbers.add(2);
        numbers.add(4);
        numbers.add(67);
        numbers.add(12);
        numbers.add(14);
        numbers.add(10);
        numbers.add(30);
        numbers.add(24);
        numbers.add(30);
        numbers.add(30);

      //  System.out.println(Exercises.getDividedByTree(numbers));
      //  System.out.println(Exercises.getDividedByValue(numbers, 5));
      //  System.out.println(Exercises.getSortedList(numbers));

     //   Exercises.numberOfDuplicates(numbers);

        Map<String, String> dictionary = new HashMap<>();

        dictionary.put("mama", "mother");
        dictionary.put("rower", "bike");
        dictionary.put("dom", "house");

      //  Exercises.dictionaryPolAng(dictionary,"dom");

     //   Exercises.toBinary(34);

        List<String> colours = exercises.randomColours(10);

        int result = exercises.whichColourIndex(colours, "#973106" );
        System.out.println(result);

    }


}
