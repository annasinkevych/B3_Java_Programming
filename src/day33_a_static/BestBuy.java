package day33_a_static;

public class BestBuy {

    //Instance variables - they belong to object
    String location;


    //STATIC VARIABLE - they belong to class -- all objects of the class share the same copy
    static String headQuarters = "Richfield, 7601 Penn Ave, United States ";
    static int numOfComp = 100;
    static String specialDay = "Wednesday";

    public BestBuy(String location)
    {
        this.location = location;
    }

    public void operStore()
    {
        System.out.println("Opening the "+ location);
    }

    //Static method
    public static void reStock()
    {
        System.out.println("Today is " + specialDay + ", special day and we are restocking");
        numOfComp = 200;
    }


}
