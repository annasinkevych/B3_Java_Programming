package day40_exceptions.throws_keyword;

public class UsingThrows {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(200);

        test();

    }

    public static void test(){

        //if I don't add throws to the method signature I need to handle it with try/catch
        try{
            Thread.sleep(200);
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }


    }

    public static void test2 ()  {
        test();
        //main();
    }


    public static void test3 () {
        test2();
    }
}
