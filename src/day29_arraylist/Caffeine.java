package day29_arraylist;

import java.util.ArrayList;
import java.util.Arrays;

public class Caffeine {

    public static void main(String[] args) {

        ArrayList <String> drinks = new ArrayList<>();
        drinks.add("coffee");
        drinks.add("tea");
        drinks.add("energy drink");
        drinks.add("soda");
        System.out.println(drinks);
        ArrayList<String> drinks2 = new ArrayList<>(drinks);//we create a NEW array that is a copy of the first one
        System.out.println(drinks2);

        String [] allDrinks = {"coffee","tea", "energy drink","soda" };

        //converting array of elements into an arraylist using .asList(T...a) methods, asList method works with var args
        ArrayList <String> drinks3 = new ArrayList<>(Arrays.asList(allDrinks));

        ArrayList <String> drinks4 = new ArrayList<>(Arrays.asList("coffee","tea", "energy drink","soda"));


        doSmth(1,3,4,5,6);

        drinks.addAll(Arrays.asList(allDrinks));//[coffee, tea, energy drink, soda, coffee, tea, energy drink, soda]
        System.out.println(drinks);

        ArrayList <String> drinks6 = new ArrayList<>();
        drinks6.addAll(Arrays.asList("coffee, tea, energy drink, soda")); //VALID because asList works with var args


        System.out.println(drinks6);
        drinks6.addAll( Arrays.asList("test2, test3"));
        System.out.println(drinks6);


        drinks6.addAll(0, Arrays.asList("check1", "check2"));
        System.out.println(drinks6);


    }

    /**
     * This methods accepts both: array of ints or elements separated by comma of int datatype and create an arrau of those elements
     * @param a - var args
     */
    public static void doSmth(int ... a)
    {


        System.out.println(Arrays.toString(a)); //[1, 3, 4, 5, 6]

    }
}
