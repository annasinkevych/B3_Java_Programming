package day18_loops;

public class CountHi {

    public static void main(String[] args) {
        String str = "aaahiahhihibbbch"; //boundry testing when checling for smth within the string until it reaches the end befpre last character and after the first character
        int count = 0;

        System.out.println(str.length());
        for(int i = 0; i < str.length()-1; i++) //i < 14 if characters equal 16
        {
            if(str.charAt(i) == 'h' && str.charAt(i+1) == 'i')
                count++;
        }
        System.out.println(count);
    }
}
