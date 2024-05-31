package day32_constructor_chaining;

public class Food {

    //Instance variables

    String name;
    int quantity;
    double unitPrice;
    double totalPrice;

    public Food(String name)
    {
        this.name = name;
    }

    public Food(String name, int quantity)
    {
        this(name);
        this.quantity = quantity;
    }
    public Food(String name, int quantity, double unitPrice)
    {
        this(name,quantity);
        this.unitPrice = unitPrice;
        calculatePrice();
    }

    public void calculatePrice()
    {
        totalPrice = unitPrice * quantity;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
