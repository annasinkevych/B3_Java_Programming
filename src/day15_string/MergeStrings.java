package day15_string;

public class MergeStrings {

    public static void main(String[] args) {
        String str1 = "abc",
               str2 = "xyz";

        String merged = "";

        merged += "" + str1.charAt(0) + str2.charAt(0);
        merged += ""+ str1.charAt(1) + str2.charAt(1);
        merged += ""+ str1.charAt(2) + str2.charAt(2);

        System.out.println(merged);
    }
}
