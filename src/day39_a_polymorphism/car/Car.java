package day39_a_polymorphism.car;

public class Car {}

class BMW extends Car{}

class Tesla extends Car{}

class Toyota extends Car{}

class Camry extends Toyota{}

class LandRover extends Car{}

class Ford{}


//if there no no IS A relation the lease() method cannot accept it as
//an argument, Ford is not a child of the Car classj
class DealerShip{
   public static void lease(Car car){
       System.out.println("Leasing a car: " + car.getClass().getName());
   }

   //return COVARIANT
   //you can only return as high as a parent class Car and it's children.
   public static Car getCar(int option){
       if(option ==1)
           return new Toyota();
       else if(option ==2)
           return new Tesla();
       else if(option ==3)
           return new LandRover();
       else
           return new BMW();
   }
}

class LocationA extends DealerShip {

    public static Camry getCar(int option) {
        if (option == 1) {
            return (Camry) new Toyota();
        } //else if (option == 2) {
        // return new Tesla();
        //} //else if (option == 3) {
        //return new Ford();// No IS-A relation
        else {
            return new Camry();
        }
    }
}

class Runner {
    public static void main(String[] args) {
        Car car = new Car();
        DealerShip.lease(car);


        Tesla tesla = new Tesla();
        DealerShip.lease(tesla);

        DealerShip.lease(new LandRover());

        DealerShip.lease(new Toyota());

        System.out.println("--------------------");


        Car car2 = DealerShip.getCar(1);    // Car = new Toyota();
        Car car3 = DealerShip.getCar(2);    // Car = new Tesla();
        Toyota t = (Toyota) DealerShip.getCar(1);    // Car = new Toyota();


    }
}