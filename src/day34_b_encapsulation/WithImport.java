package day34_b_encapsulation;
//Import all static thing in util package Arrays class
//If you di static import, all the non-static things are not accessible
import static java.util.Arrays.*;
import static java.lang.Math.*;
import static my_utilities.StringUtil.*;


public class WithImport {
    public static void main(String[] args) {
        int [] a = {81, 23, 65, 33};

        sort(a);
        System.out.println(PI);
        System.out.println(reverse("java"));

        // System.out.println(toString(a)); // Since this is a special method. Sometimes it is instance method, that is why Java here does nto know if it is static version
    }
}
