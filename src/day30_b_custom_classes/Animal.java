package day30_b_custom_classes;

public class Animal {

    //instance variables

    String species;
    long population;

    //This is A Special method. This will help us too print object directly. Once we print the object name it calls this method automatically. If this method is not added it will print some memory location.

    public String toString()
    {
        String print = "Species: " + species + "\nPopulation: " + population;

        return print;
    }
}
