package day27_wrapper_arraylist;

import my_utilities.ArrayUtil;

import java.lang.reflect.Array;
import java.util.Arrays;

public class UseAddElementMethod {

    public static void main(String[] args) {

        int [] a = {1, 3, 4, 7, 8};
        int [] b = {23, 345, 2, 0};

        System.out.println(Arrays.toString(ArrayUtil.combineArrays(a, b)));
        System.out.println(ArrayUtil.minNumArray(ArrayUtil.combineArrays(a,b)));

    }
}
