package day18_loops;

public class Syllables {

    public static void main(String[] args) {

        String str  = "ja-va-script";

        int countDash = 1;

        for(int index = 0; index< str.length(); index++)
        {
            if(str.charAt(index) == '-')
            {
                countDash++;
            }
        }
        System.out.println(countDash);
    }
}
