package day19_nested_loops;

public class FrequencyOfCharacter {
// INTERVIEW QUESTION
    public static void main(String[] args) {

        String str = "applee";

        int count = 0;
        String checked = "";


        //why two loops? i will get each letter and compare it to itself
        for(int i = 0; i < str.length(); i++ )
        {
            char letter1 = str.charAt(i);

            for(int j = 0; j < str.length(); j ++)
            {
                char letter2 = str.charAt(j);

                if(letter1 == letter2)
                    count++;
            }
            if(!checked.contains("" + letter1))
            {
                System.out.println(letter1 + " - " + count);
                checked += letter1;
            }

            count = 0;
        }
    }
}
