package day31_custom_classes;

public class Address {

    String street, city, state, zipCode;

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zipCode='" + zipCode + '\'' +
                '}';
    }

    public Address(String street, String city, String state, String zipCode)
    {
        //Since locarl variable and Instance variable share the same name, Java will prioritise local variables, to make difference between them, I used "this" keyword
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
