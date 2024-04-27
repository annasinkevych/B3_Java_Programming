package day18_loops;

public class ForLoopExample {

    public static void main(String[] args) {

        System.out.println("This is a for loop: ");
        for(int i = 0; i <=10; i+=2)
        {
            System.out.println(i);
        }

        System.out.println("This is a while loop: ");
        int z = 0;
        while(z<=10)
        {
            System.out.println(z);
            z++;
        }

        System.out.println("This is a do/while loop: ");
        int y = 0;
        do
        {
            System.out.println(y);
            y++;
        }while(y<=10);



    }
}
