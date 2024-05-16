package day25_calling_methods;


//import  package_name . class_name
import my_utilities.StringUtil;

public class MethodWithOthers {

    public static String dayInWords(int dayNum)
    {
        String dayWord = "";

        switch(dayNum)
        {
            case 1:
                dayWord = "One";
                break;
            case 2:
                dayWord = "Two";
                break;
            case 3:
                dayWord = "Three";
                break;
            case 4:
                dayWord = "Four";
                break;
            default:
                dayWord = "INVALID";
                return dayWord;
        }

        return dayWord;
    }

    public static void main(String[] args) {
        dayInWords(5);

        //calling a method from our other utility created package
        StringUtil.reverse("Hello");
    }


}

