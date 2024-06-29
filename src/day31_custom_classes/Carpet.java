package day31_custom_classes;

public class Carpet {

    boolean isPersian;
    double length, width, unitPrice, totalPrice;

    public String toString()
    {
        return "Carpet: \nLength: " + length + "\nWidth: " + width + "\nUnit price: " + unitPrice + "\nTotal Price: " + totalPrice;
    }

    public Carpet(boolean inputPersian, double inputWidth, double inputLength, double inputUnitPrice)
    {
        isPersian = inputPersian;
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnitPrice;
        calculatePrice();
    }

    public void calculatePrice()
    {
        totalPrice = width * length * unitPrice;
        if(isPersian)
            totalPrice +=200;
    }
}
