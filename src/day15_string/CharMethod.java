package day15_string;

public class CharMethod {

    public static void main(String[] args)
    {
        String str = "loop";
        //            0123
        //            numberofcharacters -1
        //count char 4 characters


        String str2 = "loopcamp.!"; //--> str2.length(); --> 10
        //             0123456789


        String st3 = "Hello World!";
        //            01234567891011


//        System.out.println(str.length());//returns int 4
//        System.out.println(str.charAt(0));//returns character at index 0 -- > l
//        System.out.println(str.charAt(1));
//        System.out.println(str.charAt(2));
//        System.out.println(str.charAt(3));

        char stringChar1 = str.charAt(0);// returns character
        String firstChar = String.valueOf(str.charAt(0));//convert char to string using type conversion and valueOf method
        System.out.println(firstChar);

        String longWord = "asfhsjklg sjghwlrjfhwlgjbs gwhlgfwbrjlhfb lgwgljfhbjf";
        System.out.println("Num of characters: " + longWord.length());
        System.out.println("Last index of the String: " + (longWord.length() -1));
        System.out.println("Last character of the string: " + longWord.charAt(longWord.length() -1)); //returns f - the last character of longWord string



    }
}
