package day08_scanner_logical_operators;

public class Discount {
    public static void main(String[] args) {
        boolean isWeekend = true,
                isTeacher = false,
                isOfficer = true,
                isFireFighter = false;

        boolean isEligibleForDiscount = isWeekend && (isTeacher || isOfficer || isFireFighter);
                                        //true    && (false  ||  true || false)
                                        //true && true --> true

        System.out.println("isEligibleForDiscount = " + isEligibleForDiscount);


    }
}
