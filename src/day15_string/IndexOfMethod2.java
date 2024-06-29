package day15_string;



public class IndexOfMethod2 {

    public static void main(String[] args) {
        String s = "java";

        System.out.println(s.indexOf("a"));//returns the index of the first occurance of a in the String(methid starts checking from the beginning of the string
        System.out.println(s.lastIndexOf("a"));//returns the index of the last a in the string(method starts checking from the end of the string)

        String s2 = "abcbcb";
        System.out.println("_____________");
        System.out.println(s2.indexOf("bc")); //returns index 1
        System.out.println(s2.lastIndexOf("bc")); //returns index 3


        System.out.println(s2.indexOf("bc", 2));//returns 3
        System.out.println(s2.lastIndexOf("bc", 2 )); //returns 1 --> as it starts checking for "bc" from right to left starting at index 2(which is ab(c)bcb -- >c)


    }

}
