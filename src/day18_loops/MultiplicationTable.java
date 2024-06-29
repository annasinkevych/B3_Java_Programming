package day18_loops;

public class MultiplicationTable {

    public static void main(String[] args) {

        for(int i = 2; i <=10; i++)
        {
            for(int z = 1; z<=10; z++)
            {
                System.out.println(i + " x " + z + " = " + i * z);
            }
            System.out.println("_____________");
        }
    }
}
