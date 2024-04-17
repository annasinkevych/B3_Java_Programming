package day08_scanner_logical_operators;

public class Store {

    public static void main(String[] args) {

        String store = "Target";
        int numOfTv = 100;

        System.out.println("In the " + store + " store there are " + numOfTv + " Tvs");
        System.out.println("Someone bought 1 TV");

        //numOfTv = numOfTv -1;
        //or
        //numOfTv--;

        //or

        numOfTv -= 1;

        System.out.println("numOfTv = " + numOfTv);

        System.out.println("Someone bought 2 more TV");
        numOfTv -= 2;

        System.out.println("numOfTv = " + numOfTv);

        System.out.println("Another person came in and put the TV into the shopping cart.");
        System.out.println("Now, in the store we have available " + numOfTv-- + " Tvs");



    }
}
