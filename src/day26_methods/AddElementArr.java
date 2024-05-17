package day26_methods;

import my_utilities.ArrayUtil;

import java.util.Arrays;

public class AddElementArr {

    public static void main(String[] args) {

        int [] a = {1,2,3};

        System.out.println(Arrays.toString(a));//[1, 2, 3]
        System.out.println(Arrays.toString(ArrayUtil.addElement(a, 943))); //[1, 2, 3, 943]

    }

}
