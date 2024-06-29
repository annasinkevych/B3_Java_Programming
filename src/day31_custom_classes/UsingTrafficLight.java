package day31_custom_classes;

import org.w3c.dom.ls.LSOutput;

public class UsingTrafficLight {

    public static void main(String[] args) {

//        TrafficLight obj1 = new TrafficLight();
//        System.out.println(obj1.color);//outputs null
//
//        obj1.color = "Green";
//        System.out.println(obj1.color);//outputs Green now

        TrafficLight obj2 = new TrafficLight("Yellow");
        System.out.println(obj2);
    }



}
