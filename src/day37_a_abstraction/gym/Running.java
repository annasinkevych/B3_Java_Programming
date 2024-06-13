package day37_a_abstraction.gym;

public class Running extends Exercise {

    public void performExercise()
    {
        System.out.println("Running " + name);
    }

    public int burnCalories(int minutes)
    {
        return 1;
    }

    public Running(String name) {
        super(name);
    }
}
