package day33_a_static;

public class Iphone {
    String model;
    double price;

    //STATIC VARIABLES
    static String company;
    static String os;
    static boolean appleDay;
    static String day;

    //CUSTOM CONSTRUCTOR
    public Iphone(String model, double price)
    {
        this.model = model;
        this.price = price;

    }
    //STATIC BLOCK - static initialization
    static{
        System.out.println("STATIC BLOCK RUN:");
        company = "Apple";
        os = "IOS";
        //model = "Ip"; //static can ACCEPT ONLY static
        day = "Wednesday";
        if (day.equals("Friday")) {
            appleDay = true;
        }
    }

    //INSTANCE METHOD
    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
