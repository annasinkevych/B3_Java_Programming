package day38_b_polymorphism.animal;

public class Wild {
    public static void main(String[] args) {

        // the reference side DETERMINES the accessibility
        // reaches the eat() from parent but run the version from object
        // if child does not have overriden version of eat(), then it will run the one from parent

        //#1 -  all possible reference / object - Lizard
        //Reference Itself
        Lizard l1 = new Lizard();
        l1.eat();
        l1.name = "Lizard";
        l1.numOfLegs = 10;
        l1.skinColor = "Camo";
        System.out.println(l1.name);
        System.out.println(l1.numOfLegs);
        System.out.println(l1.skinColor);

        //#2 - reference parent
        //the reference side determines the accessibility
        // reach the eat() from parent but run the version from object
        Reptile reptile = new Lizard();
        reptile.eat(); //runs the object version of the eat() method - the one in Lizard class
        reptile.name = "Lizard";
        reptile.numOfLegs = 10;
        //reptile.skincolor = "Camo";//is not accessible

         Animal l3 = new Lizard();
         l3.eat();
         l3.name = "Lizzard";
         //l3.numOfLegs = 8; //Animal reference doesn't have access to numOfLegs var
         //l3.skinColor = "Camo4";//Animal reference doesn't have access to skinColor var

        /**
         * We created 3 objects of Lizzard
         *  1 - Reference was ITSELF - Lizzard
         *  2 - Reference was Parent class - Reptile
         *  3 - Reference was GRAN Parent class - Animal
         */


//        //#1 -  all possible reference / object - Reptile
//        Reptile r1 = new Reptile();
//        r1.eat();
//        r1.name = "Reptile";
//        System.out.println(r1.name);

//
//        System.out.println("------------------------------");
//        //Reference Super/Parent
//        Animal l2 = new Lizard();
//        l2.eat();
//        // reach the eat() from parent but run the version from object
//        // if child does not have overriden version of eat(), then it will run the one from parent
//        Animal r2 = new Reptile();
//        r2.eat();
//
//
//        String str = new String("hi");
//        Object o = new String("bye");






    }
}