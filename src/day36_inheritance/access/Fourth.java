package day36_inheritance.access;

// Different package - Different class - but there INHERITANCE
public class Fourth extends First {
    public static void main(String[] args) {
        First obj = new First();
        System.out.println( obj.one ); // since one has public access modifier, can access from anywhere in project
        //System.out.println( obj.two );
        //System.out.println( obj.three );
        //System.out.println( obj.four );


        Fourth obj2 = new Fourth();
        System.out.println( obj2.one ); // since one has public access modifier, can access from anywhere in project
        System.out.println( obj2.two ); // Since two has protected access modifier, and Since there IS-A being in Different packages ,  Since, accessible members from Parent can Inherit to Child, child class object can have access to it
        //System.out.println( obj2.three );
        //System.out.println( obj2.four );
    }

    /*

        System.out.println( obj.two );
        System.out.println( obj.three );
        System.out.println( obj.four );
     */
}
