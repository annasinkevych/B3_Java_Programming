package day23_multidimensionalArrays;

import java.util.Arrays;

public class AverageOfEach {
    public static void main(String[] args) {
        int [][] nums = {
                {3,4,5,6},
                {5,2,6},
                {10,20,30}
        };

        double average = 0.0;
        double totalSum = 0;
        int totalElem = 0;

        for(int [] eachSingleArr : nums)
        {
            double sum = 0;
            //INNER LOOP WLL GET EACH ELEMENT IN SINGLE DIMENSIONAL ARRAY
            for(int eachElement: eachSingleArr)
            {
                sum +=eachElement;
            }
            totalSum +=sum;
            totalElem += eachSingleArr.length;
            //System.out.println("Average: " + Arrays.toString(eachSingleArr) + ": ----- " +  (sum/eachSingleArr.length));
        }

        System.out.println("2D array average: " + (totalSum/totalElem)); //average of all numbers in all arrays
    }
}
