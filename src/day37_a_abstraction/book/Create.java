package day37_a_abstraction.book;

public interface Create {


    //variables are static and final
    //abstract methods

    // if something is final, it has to be given value
    // variables in interaces are "static final" - constants
    String NAME = "Test";// public static final String NAME = "Test";

    public abstract void read(); // abstract method --- public abstract void read();

    void write(); //abstract method --- any methods made in the interface with no access modifiers are public abstract

    //everything is public in interface
}
