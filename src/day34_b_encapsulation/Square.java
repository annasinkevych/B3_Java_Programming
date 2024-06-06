package day34_b_encapsulation;

public class Square {

    private int side;

    public Square(int side)
    {
        setSide(side);
    }

    public int getSide()
    {
        return side;
    }

    public void setSide(int side)
    {
        if(side>0)
            this.side = side;
        else
            System.out.println("Invalid Num");
    }
    public int calculateArea()
    {
        return side*side;
    }
    public int calculatePerimeter()
    {
        return side*4;
    }

    public String toString()
    {
        return "Square: \n\tSide: " + side +"\n\tArea: " + calculateArea() + "\n\tPerimeter: " + calculatePerimeter();
    }

}
