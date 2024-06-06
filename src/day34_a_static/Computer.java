package day34_a_static;

public class Computer {

    //INSTANCE VARIABLES
    double price;
    String brand;
    String color;


    static boolean hasScreen;
    static boolean hasBattery;
    static boolean hasMemory;

    //initializing static variables with the values
    static{
        hasScreen = false;
        hasMemory = true;
        hasBattery = true;
    }

    public Computer(double price, String brand, String color)
    {
        this.price = price;
        this.brand = brand;
        this.color = color;
    }
}
