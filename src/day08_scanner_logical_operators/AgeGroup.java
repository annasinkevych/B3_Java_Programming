package day08_scanner_logical_operators;

public class AgeGroup {
    public static void main(String[] args) {


        int personAge = 13;

        boolean isKid = personAge <= 13;
        boolean isSenior = personAge >= 65;

        System.out.println("isSenior = " + isSenior);
        System.out.println("isKid = " + isKid);
    }
}
