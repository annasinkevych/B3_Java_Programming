package day08_scanner_logical_operators;

public class GoForWalk {
    public static void main(String[] args) {

        //Want to go for a walk
        //We will go for a walk if it is not raining and the weather is above 70

        boolean isRaining = true; //it is raining now
        int weather = 72;


//        boolean areWeGoing = !isRaining && weather >= 70; //returns false because the 1st statement is false
//                             //not true --> false If it's false
//        if (areWeGoing)
//            System.out.println("We are going for a walk"); //false
//        else
//            System.out.println("We are staying home");
//
//

        System.out.println("Go for a walk: " + (!isRaining && weather >=70));

        long a = 30L;
        short b = (short)a;

        System.out.println(b);
        System.out.println("Result A"+0+1);
        System.out.println("result B" +(1) +(2));

        float g = 100.459_524f;
        byte o = (byte)g;
        double c = o;

        System.out.println(o);
        System.out.println(c);

    }
}
