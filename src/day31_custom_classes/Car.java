package day31_custom_classes;

public class Car {

    String model, color;
    int year;
    double fuelLevel;

    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", fuelLevel=" + fuelLevel +
                '}';
    }

    public void fuelTank()
    {
        fuelLevel = 100;
    }
}
