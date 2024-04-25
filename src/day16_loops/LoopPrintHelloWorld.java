package day16_loops;

public class LoopPrintHelloWorld {

    public static void main(String[] args) {

        int x = 0;

        while(x < 5){
            System.out.println("Hello World");
            x++;
        }

        int z = 1;

        while(z<=50) {
            System.out.println("Line " + z++);
        }
        System.out.println(z);//is now 51 because the last time we've updated it it was 50 and after post increment = 51

    }
}
