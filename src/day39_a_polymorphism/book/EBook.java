package day39_a_polymorphism.book;


//abstract class doesn't have to implement both interface and book class
//abstract methods
public abstract class EBook extends Book implements Downloadable {

    double size;

    public abstract void open();
}
