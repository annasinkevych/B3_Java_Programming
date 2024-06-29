package day30_b_custom_classes;



public class AddPeople {

    public static void main(String[] args) {

        //created an object for person class --> obj - pbject reference new People() - actual object
        People obj = new People();
        obj.setName("Anna");
        System.out.println(obj.getName());

//        People.getName();

       obj.setName("Micky");
       System.out.println(obj.getName());


    }
}
