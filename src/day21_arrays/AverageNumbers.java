package day21_arrays;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] nums = {10, 15, 5, 6};

        double sum = 0;

        //use for each because we simply need to go through the array without actually
        for (int eachEl : nums) {
            sum += eachEl;
        }
        System.out.println(sum);

        System.out.println("Average: " + sum / nums.length);
    }
}
