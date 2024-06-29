package day25_calling_methods;

import my_utilities.StringUtil;

public class UniqueCharacters {


    public static String uniqueChars(String sentence)
    {
        String unique = "";
//        for (int i = 0; i < sentence.length(); i++) {
//            int count = 0;
//            for (int j = 0; j < sentence.length(); j++) {
//                if(sentence.charAt(i) == sentence.charAt(j))
//                {
//                    count++;
//                }
//            }
//            if(count == 1)
//            {
//                unique += sentence.charAt(i);
//            }
//
//        }

        for (int i = 0; i <sentence.length() ; i++) {
            char eachLetter = sentence.charAt(i);

            //calling our custom-made method from String util package
            if(StringUtil.countChars(sentence, eachLetter) == 1)
            {
                unique += eachLetter;
            }
        }

        return unique;
    }

    public static void main(String[] args) {
        System.out.println(uniqueChars("aaaaabcccdeeeef"));
    }
}
