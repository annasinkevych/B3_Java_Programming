package day27_wrapper_arraylist;

public class YahooSearch {

    public static void main(String[] args) {

        //About 7,000,000 seach results

        String result = "About 7,000,000 seach results";
        String [] resultsApt = result.split(" ");//["About", "7,000,000", "search results"]

        String element = resultsApt[1].replace("," , "");

        //wrapper class converted
        long value = Long.parseLong(element);

        //Your task: After searching make sure the number is bigger than or equal to 0
        if(value >= 0)
        {
            System.out.println("TEST CASE PASSED - POSITIVE TESTING");
        }
        else
            System.out.println("TEST CASE FAILED");


        System.out.println("After searching for \"Apartments\"" + " I see " + value );
        System.out.println("Next year, after searching for \"Apartments\"" + " I see " + (value + 1_000_000));
    }
}
