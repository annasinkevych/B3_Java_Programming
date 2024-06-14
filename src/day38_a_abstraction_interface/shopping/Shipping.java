package day38_a_abstraction_interface.shopping;

/*
Create an interface Shipping
    - Declare an abstract methods:
        payForShipping(boolean)
 */
public interface Shipping {

    String COUNTRY = "US"; // public static final

    void payForShipping(boolean hasPrime);

}