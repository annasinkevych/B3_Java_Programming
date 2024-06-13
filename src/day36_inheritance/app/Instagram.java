package day36_inheritance.app;

public class Instagram extends App{
    public Instagram( double version)
    {
        //calling super class constructor always in the first line
        super("Instagram", version);
    }

    public void postPicture()
    {
        System.out.println("Posting picture to " + name);
    }
}
