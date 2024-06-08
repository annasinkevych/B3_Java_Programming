package day33_b_encapsulation.day35_inheritance.book;

public class AudioBook extends Book{

    double duration;
    String narrator;

    public void listen()
    {
        System.out.println("Listening to " + title+ "narrate by: " + narrator);
    }

}
