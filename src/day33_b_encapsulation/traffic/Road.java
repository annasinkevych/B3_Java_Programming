package day33_b_encapsulation.traffic;

public class Road {

    public static void main(String[] args) {
//        TrafficLight light = new TrafficLight();
//        light.color = "green";
//        System.out.println(light.color);

        TrafficLight light = new TrafficLight("Purple");
        System.out.println(light.getColor()); //return null because we have a condition within setter method that will determine if the setter setColor will set the color to the color passed as an argument into the custom constructor

        TrafficLight light2 = new TrafficLight("Green");
        System.out.println(light2.getColor()); //Green
        light2.setColor("Yellow");
        System.out.println(light2.getColor());//Yellow
    }
}
