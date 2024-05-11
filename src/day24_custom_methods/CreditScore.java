package day24_custom_methods;
import java.util.*;

public class CreditScore {


    public static int getCreditScore()
    {
        Scanner key = new Scanner(System.in);
        System.out.println("Enter your credit score: ");
        int score = key.nextInt();

        return score;
    }

    public static boolean isGoodCreditScore(int score)
    {
        boolean isGood = (score >= 800)? true: false;
        return isGood;
    }


    public static void main(String[] args) {

       System.out.println(isGoodCreditScore(getCreditScore()));
    }
}
