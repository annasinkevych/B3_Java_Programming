package day37_a_abstraction.gym;

public class Gym {

    public static void main(String[] args) {

        //Exercise obj1 = new Exercise("Running");

        Running obj1 = new Running("Marathon");
        obj1.performExercise();

        PullUps obj2 = new PullUps("CrossFit");
        obj2.performExercise();
        System.out.println(obj2.burnCalories(10));


    }
}
