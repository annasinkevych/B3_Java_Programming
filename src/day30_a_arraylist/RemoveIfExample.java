package day30_a_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
/*

    Lambda functions
    /removeIf
    /replaceAll
 */
public class RemoveIfExample {

    public static void main(String[] args) {
        ArrayList<Integer> base = new ArrayList<>(Arrays.asList(4,6,2,5,12,9,143,4,7,8,2));
        ArrayList<Integer> nums = new ArrayList<>(base);

//
//        for(Integer each : nums)
//        {
//            if(each %2 == 0)
//            {
//                nums.remove(each);
//            }
//        }
        nums.removeIf(each-> each % 2 == 0);
        System.out.println(nums);
        ArrayList<Integer> nums2 = new ArrayList<>(base);
        nums2.removeIf(each-> each > 10);
        System.out.println(nums2);
        ArrayList<Integer> nums3 = new ArrayList<>(base);
        nums3.replaceAll(e -> e*2);
        System.out.println(nums3);


    }
}
