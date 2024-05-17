package day26_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class UsingArrayUtil {

    public static void main(String[] args) {
        int [] a = {3 ,1, 5, 7, 3, 23};
        int [] b = {24 ,9, 5, 7, 3, 60};

        System.out.println(ArrayUtil.minNumArray(a));
        System.out.println(ArrayUtil.maxNumArray(a));
        System.out.println(ArrayUtil.contains(a, 2));
        System.out.println(Arrays.toString(ArrayUtil.combineArrays(a,b)));



    }
}
