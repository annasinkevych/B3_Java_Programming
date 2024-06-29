package day34_a_static;

public class ComputerLab {
    public static void main(String[] args) {
       Computer obj1 = new Computer(500.00, "HP", "Silver");

       //the static block of the Computer class initiliazed the static variables, it runs once when the object of the class has been created

        //then we reassigned the static field to false
       Computer.hasBattery = false;

        Computer obj2 = new Computer(400.00, "Dell", "Black");

        System.out.println(Computer.hasBattery);

        //WHEN CHANGING THE STATIC FIELD VALUE WE ARE CHANGING IT FOR ALL THE OBJECTS OF THE CLASS
    }
}
