package day37_a_abstraction.gym;

public abstract class Exercise {

    String name;
    public abstract void performExercise();

    public abstract int burnCalories(int minutes);

    public Exercise(String name) {
        this.name = name;
    }
}
