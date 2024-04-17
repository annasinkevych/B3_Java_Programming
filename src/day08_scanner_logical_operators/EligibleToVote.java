package day08_scanner_logical_operators;

public class EligibleToVote {

    public static void main(String[] args) {

        String name = "Tom Jerry";
        boolean isCitizen = true;
        boolean isCriminal = false;

        int age = 49;

        boolean isEligible = isCitizen && !isCriminal && age >=18;
                            //true     &&  true       &&  true    ---> true

        System.out.println(isEligible);

        System.out.println(name + " is eligible to vote: " + isEligible);


        //Person #2

        String name2 = "Vinnie Pooh";
        boolean isCitizen2 = true;
        boolean isCriminal2 = true;

        int age2 = 52;

        boolean isEligible2 = isCitizen2 && !isCriminal2 && age2 >=18;
                             //true      &&  false       &&  true --> false

        System.out.println(name2 + " is eligible to vote: " + isEligible2);





    }
}
