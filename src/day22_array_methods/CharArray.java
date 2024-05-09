package day22_array_methods;

import java.util.Arrays;

public class CharArray {

    public static void main(String[] args) {

        String str = "loopcamp";
        char [] letters = new char [str.length()];

        for(int i = 0; i < str.length(); i++)
        {
           letters[i] = str.charAt(i);
        }

        System.out.println(Arrays.toString(letters)); // --> [l, o, o, p, c, a, m, p]
        System.out.println(Arrays.toString(letters).replaceAll(",", "")); // --> [l, o, o, p, c, a, m, p]

        char [] letters2 = str.toCharArray();
        System.out.println(Arrays.toString(letters2));
        String word = "java";

        word.toCharArray(); //this method only works with a string --> automatically converts string to char array

        System.out.println(Arrays.toString(word.toCharArray()));
        //prints the word string that was converted to array without square brackets []
        System.out.println("***********");
        System.out.println(Arrays.toString(word.toCharArray()).substring(1, Arrays.toString(word.toCharArray()).length()-1));

        for(char each: word.toCharArray())
        {
            System.out.println(each);
        }

        System.out.println("_________");
        char [] letters3 = {'j', 'a', 'v', 'a', 'c'};
        System.out.println(Arrays.toString((letters3)));




        //Convert char array directly into a string and works ONLY with a char array
        char [] letters4 =  {'h', 'e', 'l', 'l','o'};
        String str2 = new String(letters4);
        System.out.println(str2);//hello


        //convert string to a char array
        String s = "Jerry";
        char [] ch = s.toCharArray();
        System.out.println(Arrays.toString(ch)); //[J, e, r, r, y]

        //convert your char array to a String
        String str22 = new String(ch);
        System.out.println(str22); //Jerry


    }
}
