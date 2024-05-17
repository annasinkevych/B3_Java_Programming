package day26_methods;

public class Picture {

    /**
     * METHOD OVERLOADING IMPLEMENTATION
     *
     * For Overloading we need
     * same name
     * different type of parameters
     * different number of parameters
     * different order of data types
     */
    public static void draw()
    {
        System.out.println("Trying to draw");
    }

    public static void draw(String color)
    {
        System.out.println("Drawing with " + color + " color.");
    }

    public static void draw(String color, String color2)
    {
        System.out.println("Drawing with " + color + " and " + color2 +  " colors.");
    }

}
