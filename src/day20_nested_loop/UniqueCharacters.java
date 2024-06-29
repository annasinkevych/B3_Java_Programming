package day20_nested_loop;

public class UniqueCharacters {

    public static void main(String [] args)
    {
        String str = "AABCDDFGWOF&#($";

        for(int i = 0; i < str.length(); i++)
        {
            int count = 0;
            int j = 0;

            while(j < str.length() )
            {
                if(str.charAt(i) == str.charAt(j))
                    count++;

                j++;
            }
            if(count == 1)
            {
                System.out.print(str.charAt(i));
            }
        }

        // or another solution

//        int count;
//
//        for (int i = 0; i < str.length(); i++) {
//            char eachLetter = str.charAt(i); //we can also use substrings here
//            count = 0;
//
//            for (int j = 0; j < str.length(); j++) {
//                char eachLetter2 = str.charAt(j);
//                if(eachLetter == eachLetter2)
//                    count++;
//            }
//
//            if(count ==1)
//                System.out.print(eachLetter);
//
//        }

    }
}
