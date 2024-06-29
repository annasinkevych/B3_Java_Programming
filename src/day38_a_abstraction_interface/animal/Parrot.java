package day38_a_abstraction_interface.animal;

import day37_a_abstraction.language.Language;

public class Parrot extends Bird implements Flyable, Language {


    //abstract method from Animal class
    @Override
    public  void eat()
    {
        System.out.println("Parrot is eating seeds");
    }

    //abstract method from Fluyable interface

    public void fly()
    {

    }

    //abstract method from Language interface
    public void hi()
    {
        System.out.println("Hi hi");
    }
    public void bye()
    {
        System.out.println("bye bye bye");
    }
}
