package day33_b_encapsulation.access_modifiers;

public class AccessModifiers {

    public int a;   // INSTANCE VARIABLE - public access modifier
    int b;          // INSTANCE VARIABLE - default access modifier
    private int c;  // INSTANCE VARIABLE - private access modifier


    public static int x;     // STATIC VARIABLE - public access modifier
    static int y;            // STATIC VARIABLE - default access modifier
    private static int z;    // STATIC VARIABLE - private access modifier


    //In the SAME CLASS - SAME PACKAGE (Automatically in same package)
    public static void main(String[] args) {
        AccessModifiers obj = new AccessModifiers();
        /**NOTE:
         *  Since it is in the same class and package, we can access
         *  public, default and private
         */

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);


        /**NOTE:
         * Since it is in the same class and package, we can access
         * - public, default and private
         *
         */

        System.out.println(AccessModifiers.x);
        System.out.println(AccessModifiers.y);
        System.out.println(AccessModifiers.z);

    }
}