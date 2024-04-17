package day12_switch_statements;
import java.util.*;

public class DayInWeek {

    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);
        int num = key.nextInt();

        String message = "";

        switch(num)
        {
            case 1:
                message = "Monday";
                break;
            case 2:
                message = "Tuesday";
                break;
            case 3:
                message = "Wednesday";
                break;
            case 4:
                message = "Thursday";
                break;
            case 5:
                message = "Friday";
                break;
            case 6:
                 message = "Saturday";
                break;
            case 7:
                message = "Sunday";
                break;
            default:
                message = "The number is not between 1 and 7";

        }


        System.out.println(message);


    }
}
