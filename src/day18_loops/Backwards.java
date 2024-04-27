package day18_loops;

public class Backwards {

    public static void main(String[] args) {

        for(int i = 20;i>=0; i--)
        {
            System.out.println(i);
        }

        String str = "loop";
        System.out.println("Print string \"" + str + "\" backwards: ");
        for(int i = str.length()-1; i >=0; i--)
        {
            System.out.println(str.charAt(i));
        }
    }
}
