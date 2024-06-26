package day36_inheritance.access;

public class First {

    /*
    // Same package - Same class
// obj is in the same class with all the variables with different access modifiers
// Since it is in the same class, obj can have access to all
     */

    public int one = 1;
    protected int two = 2;
    int three = 3;
    private int four = 4;


    public static void main(String[] args) {

        First obj = new First();
        System.out.println( obj.one );
        System.out.println( obj.two );
        System.out.println( obj.three );
        System.out.println( obj.four );

    }
}
