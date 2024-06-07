package day35_inheritance;

public class EBook extends Book{

    double size;
    int pages;

    public void read()
    {
        System.out.println("Reading a digital copy of"+ title);
    }
}
