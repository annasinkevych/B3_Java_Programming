package day34_c_inheritance.person;

public class Bulding {
    public static void main(String[] args) {

        Person p = new Person();
        p.name = "general name";
        p.age = 0;
        p.talk();
        //p.study(); // Parent class cannot reach anything from Child
        //p.isHappy = true;


        Student s1 = new Student();
        s1.name = "Winnie"; // Child class can access to Parent class members
        s1.age = 18;  // Child class can access to Parent class members
        s1.talk(); // Child class can access to Parent class members
        s1.study(); // Child class can access to its own members
        s1.isHappy = true;

        OnlineStudent o1 = new OnlineStudent();
        o1.name = "Tom";
        o1.isHappy = true;
        o1.zoomLinkAddress = "https://.....";



    }
}
