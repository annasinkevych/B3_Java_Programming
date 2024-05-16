package day25_calling_methods;

import my_utilities.ArrayUtil;

public class ContainArray {

//    public static boolean contains(int [] arr, int num)
//    {
//        for(int each: arr)
//        {
//            if(each == num)
//                return true;
//        }
//        return false; // in case no number was found in the array
//    }

    public static void main(String[] args) {

        int [] arr = {1,2,3,4,5,636,47,5685,979,56};

        System.out.println(ArrayUtil.contains(arr, 56)); //returns true
    }

}
