package day31_custom_classes;

public class TrafficLight {

    private String color;//class Constructor
    public TrafficLight(String color)
    {
        this.color = color;


    }


    @Override
    public String toString() {
        return "TrafficLight{" +
                "color='" + color + '\'' +
                '}';
    }


}

