package day39_a_polymorphism.book;

public abstract class Book {

    String name;
    //we force this method to be implemented
    //when this class extends another class
    //that is concrete
    public abstract void read();
}
