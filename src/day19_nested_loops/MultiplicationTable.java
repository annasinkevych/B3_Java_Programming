package day19_nested_loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        //outer loop
        for (int i = 1; i <=10 ; i++) {
            //inner loop
            for (int j = 1; j <=10; j++) //loop from 1 to 10 so 10 times --> exits --> then increments i and continues the outer loop
            {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println();
        }


    }
}
