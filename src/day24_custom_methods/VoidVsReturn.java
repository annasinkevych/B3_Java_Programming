package day24_custom_methods;

public class VoidVsReturn {


    public static void sayHello()
    {
        System.out.println("Hello!");
    }

    public static String sayHello2()
    {
        String name = "Hello2!";

        return name;
    }


    public static void main(String[] args) {

        System.out.println(sayHello2());
    }
}
