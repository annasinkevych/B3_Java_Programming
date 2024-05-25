package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SwitchBadPairs {

    public static void main(String[] args) {

        ArrayList <String> words = new ArrayList<>(Arrays.asList("Cat", "In", "the", "Hat"));

        for (int i = 0; i < words.size() ; i+=2) {
            Collections.swap(words,i, i+1);
        }
        System.out.println(words);
    }
}
