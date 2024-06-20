package day40_exceptions.learn_exception;

public class FirstTry {

    public static void main(String[] args) {

        System.out.println("First print out");

        String str = "loopcamp";

        try{
            System.out.println(str.charAt(0));

        }catch(Exception e){
            System.out.println("Exception is caught");
        }

        System.out.println("Last print out");
    }
}
