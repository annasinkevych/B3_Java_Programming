package day39_a_polymorphism.clothes;

public class Jacket extends Clothes implements HasHood{
    public void wear(){
        System.out.println("Wearing a Jacket");
    }

    @Override
    public void putOnHood(){
        System.out.println("Put Jacket's hood on");
    }
}
