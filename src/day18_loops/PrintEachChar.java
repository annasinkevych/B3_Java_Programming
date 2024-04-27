package day18_loops;

public class PrintEachChar {

    public static void main(String[] args) {

        String str = "loop";

        for(int i = 0; i < str.length(); i++)
        {
            System.out.println(str.charAt(i));
        }
    }
}
