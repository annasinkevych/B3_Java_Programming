package day08_scanner_logical_operators;

public class ShortCircuit {

    public static void main(String[] args) {
        System.out.println(true || 5/0 == 0); //short circuit OR --> ||
        //System.out.println(true | 5/0 == 0); //OR --> | , we are telling the compiler to run/check the 2nd expression too even though the 1st one is already true and it would have returned the entire statement as being true

        //System.out.println(false & 5/0 == 0); //AND --> & , we are telling the compiler to run/check the 2nd expression too even though the 1st one is already false and it would have returned the entire statement as being false


        System.out.println("____________________________________-");
        int a = 0;
        System.out.println(false && a++ == 5); //output false - secind expression is not executed/checked therefore a++ is not incremented
        System.out.println(a);
    }
}
