package day33_b_encapsulation;

public class UseLogin {

    public static void main(String[] args) {

        Login person1 = new Login("loopcamp", "loopAcademy1234!");

        //INSTANCE VARIABLES declared as private --> ONLY ACCESSIBLE within the same class
//        System.out.println(person1.password);
//        System.out.println(person1.username);


       //person1.loginInfo();

        System.out.println(person1.getPassword("loopcamp"));
    }
}
