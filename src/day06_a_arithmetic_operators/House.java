package day06_a_arithmetic_operators;

public class House {

    public static void main(String [] args)
    {
        String houseType = "Penthouse",
               address = "12345 Test St";

        byte numberOfBedrooms = 5,
             numberOfBathrooms = 4,
             numberOfKitchens = 1;

        int zipCode = 31141, schoolRating = 5;

        boolean isThereABasement = false,
                isThereAnAttic = false,
                isThereAPool = true,
                isForSale = false,
                hasPark = true;

        double cost = 999_900.99;

    String houseInfo = "The " + houseType + " on " + address + ", " + zipCode + " costs $" + cost + "The " + houseType + " has the attic: " + isThereAnAttic + ", has a basement: " + isThereABasement + ", has a pool: " + isThereAPool + " is on sale: " + isForSale + ", has a park: " + hasPark + ". The schools in the area have a rating of " + schoolRating;


        System.out.println(houseInfo);
    }
}
