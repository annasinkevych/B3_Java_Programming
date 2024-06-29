package day25_calling_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class MinNumberInArray {

//    public static int minNumber(int [] arr)
//    {
//        Arrays.sort(arr); //smallest to biggest no need to assign to a variable
//        return arr[0];
//    }
//
//    public static int minNumArray(int [] arr)
//    {
//        int min = 2_147_483_647;
//
//        for(int each: arr)
//        {
//            if(each < min)
//                min = each;
//        }
//
//        return min;
//    }

    public static void main(String[] args) {


        int [] arr = {8, 5, 2, 9, 10, 11};

        System.out.println(ArrayUtil.minNumArray(arr));
        System.out.println(ArrayUtil.minSortNumber(arr));
    }
}
