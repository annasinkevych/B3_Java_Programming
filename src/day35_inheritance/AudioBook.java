package day35_inheritance;

public class AudioBook extends Book{

    double duration;
    String narrator;

    public void listen()
    {
        System.out.println("Listening to " + title+ "narrate by: " + narrator);
    }

}
