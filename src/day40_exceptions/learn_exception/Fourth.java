package day40_exceptions.learn_exception;

public class Fourth {

    public static void main (String[] args) {

        try{
            System.out.println("Start");
            Thread.sleep(-200);
        }
        catch(Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());//timeout value is negative
        }
      ;
    }
}
