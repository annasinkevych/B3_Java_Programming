package day26_methods;

public class SumOfElements {
    public static void main(String[] args) {
        int [] arr = {1,3,4,5,7};

        System.out.println(sum(arr));
        System.out.println(sum(34,56,67,345,3457,56));//takes even whole numbers as an array with var args
    }

//    public static int sum (int [] arr)
//    {
//        int sum = 0;
//        for(int each: arr)
//        {
//            sum += each;
//        }
//
//        return sum;
//    }


    //Method that returns a sum of array elements with the help of var-args - ONLY FOR ARRAYS (var args - variable arguments)
    public static int sum (int ... arr) //takes even whole numbers as an array, convenient no need to create an array just pass the numbers and it will return an array with those numbers
    {
        int sum = 0;
        for(int each: arr)
        {
            sum += each;
        }

        return sum;
    }

}
