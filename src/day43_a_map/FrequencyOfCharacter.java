package day43_a_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class FrequencyOfCharacter {

    public static void main(String[] args) {
        String word = "looopcamp";

        frequencyOfCharacter(word);


    }

    public static void frequencyOfCharacter(String word) {


        //LinkedHashMap - to maintain the insertion order
        Map <Character, Integer> charactersFrequecy = new LinkedHashMap<>();


        for(int i = 0; i < word.length(); i++)//with this loop, I want to loop through word and get each character
        {
            char eachChar = word.charAt(i); //char will be Autoconverted into Character

            if(!charactersFrequecy.containsKey(eachChar))
            {
                charactersFrequecy.put(eachChar, 1);
            }
            else
            {
                charactersFrequecy.put(eachChar, charactersFrequecy.get(eachChar) + 1);
            }


        }

        System.out.println(charactersFrequecy);
    }
}
