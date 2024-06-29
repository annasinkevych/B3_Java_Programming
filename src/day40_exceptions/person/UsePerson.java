package day40_exceptions.person;

public class UsePerson {
    public static void main(String[] args) throws Exception {

        Person obj = new Person();

        obj.setName("");

        try {
            obj.setName("");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

        System.out.println(obj.getName());

//        obj.setName("");
//        System.out.println(obj.getName());
        System.out.println("Hello");


        try {
            obj.setAge(130);
        }catch (RuntimeException e){
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Bye");

        obj.setName("Mike");


    }
}
