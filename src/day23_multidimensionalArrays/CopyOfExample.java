package day23_multidimensionalArrays;

import java.util.Arrays;

public class CopyOfExample {

    public static void main(String[] args) {

        int [] a = {1,2,3};
        int [] b = a; //b is another array REFERENCE name

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        a[0] = 10;
        b[1] = 200;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();

        // copy elements from array a to array z
        int [] z = new int [a.length];
        for (int i = 0; i < z.length; i++) {
            z[i] = a[i];

        }
        System.out.println(Arrays.toString(z));

        System.out.println();
        //shorter method copyOf copies elements of 1 array to another(creates a copy of an array)
        int [] y = Arrays.copyOf(a,a.length);
        System.out.println(Arrays.toString(y));
        System.out.println();

        int [] x = new int [a.length*2];

        for (int i = 0; i < a.length; i++) {
            x[i] = a[i];
        }

        System.out.println(Arrays.toString(x));
        System.out.println();
        int [] k = Arrays.copyOf(a, a.length *2);

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(k));

        System.out.println();
        int [] l = Arrays.copyOf(a, a.length -1 );

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(l));
        /*
        Output
        [10, 200, 3]
        [10, 200]
         */



    }

}
