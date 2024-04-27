package day18_loops;

public class BranchingExample {

    public static void main(String[] args) {

        for(int i = 0; i <=10; i++)
        {
            if(i %2 ==1)
                continue; // --> forces the code to go back to the for loop beginning

            System.out.println(i + " ");
        }


        for(int i = 0; i <=10; i++)
        {
            if(i == 6)
                break; // --> forces the code to go back to the for loop beginning

            System.out.println(i + " ");
        }
    }
}
