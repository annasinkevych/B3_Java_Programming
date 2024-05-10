package day23_multidimensionalArrays;

import java.util.Arrays;

public class MultiArrayExample {
    public static void main(String[] args) {

        int [] n = {5,10,20,10}; //single dimensional array
        int [] m = {5,10,100, 39,19}; //single dimensional array

        int [] [] all = {n,m}; //store 2 single dimensional arrays in a  2D ARRAY

        System.out.println(Arrays.toString(all)); //will give some hashcode/memory location for each single array

        //use Arrays.deepToString() method to print a 2D array

        System.out.println(Arrays.deepToString(all)); //[[5, 10, 20, 10], [5, 10, 100, 39, 19]]

        System.out.println();

        int [] [] multi = {{90, 80, 70}, //SINGLE ARRAY At 2D array index of 0
                          {19,324, 5463,123},//SINGLE ARRAY At 2D array index of 1
                           {234, 324},//SINGLE ARRAY At 2D array index of 2
                            {65}} ;//SINGLE ARRAY At 2D array index of 03

        System.out.println(multi.length); // 4 --> number of single dimensional arrays
        System.out.println(multi[0].length);
        System.out.println(multi[1].length);
        System.out.println(multi[2].length);
        System.out.println(multi[3].length);
        System.out.println();

        System.out.println();
        System.out.println(multi[1][2]); //5646
        //System.out.println(multi[3][2]); // ArrayIndexOutOfBoundsException: Index 2 out of bounds for length 1


        System.out.println();
        System.out.println(multi[1]);
        System.out.println(Arrays.toString(multi[1]));


    }
}
