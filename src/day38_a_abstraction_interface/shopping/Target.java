package day38_a_abstraction_interface.shopping;

/*
Create a concrete class Target
    - Make the class final []
    - Inherit Shopping and implement all abstract methods

 */
public final class Target extends Shopping {
    @Override
    public void buyItems() {
        System.out.println("Buying from Target");
    }

    @Override
    public void returnItem() {
        System.out.println("Returning item to Target");
    }

}
