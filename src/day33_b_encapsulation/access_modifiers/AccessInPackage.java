package day33_b_encapsulation.access_modifiers;

public class AccessInPackage {

    //In the DIFFERENT CLASS - SAME PACKAGE
    public static void main(String[] args) {
            AccessModifiers obj = new AccessModifiers();
            // Since it is in the same class and package, we can access
            // - public, default and private
            System.out.println(obj.a);
            System.out.println(obj.b);
            //System.out.println(obj.c);

            // Since it is in the same class and package, we can access
            // - public, default and private
            System.out.println(AccessModifiers.x);
            System.out.println(AccessModifiers.y);
            //System.out.println(AccessModifiers.z);

            /**
             * NOTE:
             *  c and z variables have "private" access modifiers.
             *  That is why they are ONLY accessible in the SAME CLASS
             *  In here, since we are in a different class, we cannot access them
             */

    }
}
