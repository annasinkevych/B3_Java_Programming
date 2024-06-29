package day25_calling_methods;

public class FrequencyOfChar {

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

    public static void main(String[] args) {
        String word = "apple";
        char letter = 'p';

        System.out.println(countChars(word, letter));

    }
}
