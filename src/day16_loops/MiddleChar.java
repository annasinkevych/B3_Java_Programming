package day16_loops;

public class MiddleChar {

    public static void main(String[] args) {
        String str = "adbce";
        String chars;
        if(str.length() % 2 ==0)
             chars= str.substring(str.length()/2 -1, str.length()/2 +1);
        else
            chars = str.substring(str.length()/2, str.length()/2 + 1);

        System.out.println(chars);


    }
}
