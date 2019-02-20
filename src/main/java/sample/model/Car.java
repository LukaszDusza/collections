package sample.model;

import java.util.Objects;

public class Car {

    private String brand;
    private int horsePower;

    public Car(String brand, int horsePower) {
        this.brand = brand;
        this.horsePower = horsePower;
    }

    public Car() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }


}
