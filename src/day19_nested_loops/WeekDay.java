package day19_nested_loops;

public class WeekDay {

    public static void main(String[] args) {

        //fori - shortcut for for loop
        for (int i = 1; i <=4 ; i++) {

            System.out.println("Week "+ i);
            for (int j = 1; j <=7; j++) {
                System.out.println("\tDay " + j);

            }

        }
    }
}
