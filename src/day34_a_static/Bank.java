package day34_a_static;

public class Bank {

    public static void main(String[] args) {
        DebitCard obj = new DebitCard(12333575342636663L, "Anna", 1_000_000);

        System.out.println(obj);

        // Create multiple objects also with INVALID inputs.
        DebitCard dc2 = new DebitCard(123456123456L, "Micky Mouse", 100_000.00 );


        DebitCard dc3 = new DebitCard(123456123456L, "Micky Mouse", "AMEX", 12345, 100_000.00 );


    }
}
