package my_utilities;


/**
 * MY CUSTOM UTILITY PACKAGE
 */

public class StringUtil {

    /**
     * Returns the reversed version of string
     * @return returns the reversed sequence of characters
     */
    public static String reverse(String word)
    {
        String reversed = "";

        //you can also split it to chars and then loop through each char
        for (int i = word.length()-1; i >=0  ; i--) {
            reversed += word.charAt(i);
        }

        return reversed;
    }

    /**
     * returns the formatted version of a String
     * @return the first letter in Upper Case and rest in lower case as a String
     */
    public static String fixFormat(String words)
    {
        String result = "";
        result = words.substring(0,1).toUpperCase() + words.substring(1).toLowerCase();
        return result;
    }

    /**
     * Returns the number of characters repeated in a String based on user input
     * @param words is the String that the method will check
     * @param letter is a char the method will check and count how often it appears
     * @return int data type - count how many times the letter appeared in a word
     */
    public static int countChars(String words, char letter)
    {
        int count = 0;
        for (int i = 0; i < words.length(); i++)
        {
            if(words.charAt(i) == letter)
            {
                count++;
            }
        }

        return count;
    }

    /**
     * This method calls this class custome method called countChars and shows the number of UNIQUE characters in a String
     * @param sentence take a String as a parameter that will be checked for unique characters
     * @return a String of concatenated letters that did not appear in the String more than 1 - UNIQUE CHARACTERS
     */
    public static String uniqueChars(String sentence)
    {
        String unique = "";
        for (int i = 0; i <sentence.length() ; i++) {
            char eachLetter = sentence.charAt(i);

            //calling our custom-made method from String util package
            if(countChars(sentence, eachLetter) == 1)
            {
                unique += eachLetter;
            }
        }

        return unique;
    }

}
