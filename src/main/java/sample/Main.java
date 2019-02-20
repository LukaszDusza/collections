package sample;

import sample.tasks.ArrayListSample;
import sample.tasks.LinkedListSample;

public class Main {

    public static void main(String[] args) {

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

        arrayListSample.getCar(450);


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

        linkedListSample.getCar(450);
    }
}
