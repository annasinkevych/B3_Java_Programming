package day34_c_inheritance.animal;

public class Zoo {

    public static void main(String[] args) {

        Animal animal1 = new Animal();

        Dog dog1 = new Dog();
        dog1.species = "Corgi";
        dog1.bark();
        dog1.walk();

        Lion lion1 = new Lion();
        lion1.species = "Artic Lion";
        lion1.walk();
        lion1.roar();
    }
}
