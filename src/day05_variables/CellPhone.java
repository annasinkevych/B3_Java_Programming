package day05_variables;

public class CellPhone {
    public static void main (String [] args)
    {
        //print all the vars like that:
        //apple, iphone 10, black, 1000.99, 128, true, A


        String brand = "Apple";
        String model = "Iphone 10";
        String color = "black";
        double price = 1000.99;
        int storage = 128;
        boolean hasCamera = true;
        char sim = 'A';

        System.out.println(brand + ", " + model + ", " + color + ", " + price + ", " + storage +
                           ", " + hasCamera + ", " + sim);


        //or


        String fullMessage = "I have an " + model + " from " + brand  + "\nIt came in the color " + color + " and it has " + storage + " GB" + "\nFor the sim type " + sim + " with a camera: " + hasCamera + ", the total price is $" + price;

        System.out.println(fullMessage);


    }
}
