package day24_custom_methods;

public class MyFirstMethod {

    public static void main(String[] args) {

        int birthYear = 1994, currentYear = 2024;
        helloWorld();

        System.out.println("My age is: " + printAge(birthYear,currentYear));

        for (int i = 0; i < 50; i++) {
            helloWorld();
        }

    }

    public static void helloWorld()
    {
        System.out.println("Hello world!");
    }

    private static int printAge(int birthY, int currentY)
    {
        int age = currentY - birthY;
        return age;
    }

}
