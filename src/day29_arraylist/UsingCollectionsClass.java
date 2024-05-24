package day29_arraylist;

import java.sql.Array;
import java.util.*;


public class UsingCollectionsClass {

    public static void main(String[] args) {

        ArrayList <Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(3,6,5,7,5,2,0));

        Collections.sort(list);
        System.out.println(list);//[0, 2, 3, 5, 5, 6, 7]

        Collections.reverse(list);
        System.out.println(list);//[7, 6, 5, 5, 3, 2, 0]

        ArrayList <Character> characters = new ArrayList<>(Arrays.asList('A', 'B', 'D', 'C'));
        Collections.sort(characters);
        System.out.println(characters);//[A, B, C, D]
        Collections.reverse(characters);
        System.out.println(characters);

        //max(), min() DON"T DO IT LIKE THIS DURING THE INTERVIEW
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));

        //DO LIKE THIS
        //Unboxing -- converts wrapper class object into primitive
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < list.size(); i++) {
            if(list.get(i) > max)
                max = list.get(i);
            else if(list.get(i) < min)
                min = list.get(i);
        }

        System.out.println(max); //7
        System.out.println(min); //0

        //.swap()
        Collections.swap(characters, 0, 3);
        Collections.swap(characters, 1, 2);
        System.out.println(characters);//[A, B, C, D]

        //.frequency()
        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(11,11,2,11,20,30));
        System.out.println(Collections.frequency(numbers, 11));

        String str = "aabbbcccdde";
        ArrayList <String> word = new ArrayList<>(Arrays.asList(str.split("")));//split reruns an array of strings

        String checked = "";
        for (String each: word)
        {
            if(!checked.contains(each))
            {
                System.out.println(each + ": " + Collections.frequency(word,each));
                checked += each;
            }
        }
        System.out.println(checked);

        ArrayList <String> strArrList = new ArrayList<>(Arrays.asList("one", "two", "five", "five", "ten"));

        System.out.println(Collections.frequency(strArrList, "six"));//0
        System.out.println(Collections.frequency(strArrList, "five" +
                ""));//2



    }
}
