package day30_b_custom_classes;

public class Item {

    String name;
    double price;


    //To add default toString() method -->
    // right click - generate -- toString()
    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
