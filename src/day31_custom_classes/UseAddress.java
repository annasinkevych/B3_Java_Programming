package day31_custom_classes;

public class UseAddress {

    public static void main(String[] args) {
        Address address1 = new Address("48 Peter Island", "St.Augustine", "FL", "32092");

        System.out.println(address1);

        address1.city = "Miami";
        System.out.println(address1);
    }
}
