package day21_arrays;

public class SumUpElements {

    public static void main(String[] args) {
        int [] nums = {3,6,10};

        System.out.println("Total: " + (nums[0] + nums[1] + nums[2]));

        int sum = 0;

        for(int num: nums)
        {
            sum += num;
        }

        System.out.println(sum);
    }
}
