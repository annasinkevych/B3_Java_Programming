package day30_b_custom_classes;

public class CreateAnimal {

    public static void main(String[] args) {
        Animal elephant = new Animal();

        elephant.population = 10000;
        elephant.species = "Mammals";
//        System.out.println(elephant.population);
//        System.out.println(elephant.species);

        //Prints this
        /*
            Species: Mammals
            Population: 10000
         */
        System.out.println(elephant);


    }
}
