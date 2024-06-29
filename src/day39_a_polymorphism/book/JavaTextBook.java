package day39_a_polymorphism.book;


//this is a concrete class so it needs to implement all the abstract
//methods from all the parent classes(has IS A relationship) and their interfaces
public class JavaTextBook extends EBook {

    boolean isFun;

    @Override
    public void read(){
        System.out.println("Reading Java text book...");
    }

    @Override
    public void open(){
        System.out.println("Opening Java text book...");
    }

    @Override
    public void download(){
        System.out.println("Downloading Java text book...");
    }
}
