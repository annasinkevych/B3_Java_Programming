package day30_b_custom_classes;

public class UsingApp {

    public static void main(String[] args) {
        //create an instance of App class <-> object of App class

        App obj = new App();
        App obj2 = new App();

        obj.name = "loopcamp";
        obj.version = 2.0;
        obj.isFree = false;
        System.out.println(obj.name + "\n" + obj.version + "\n" + obj.isFree);





    }


}
