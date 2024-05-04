package day21_arrays;

public class EvenOrOdd {

    public static void main(String[] args) {

        int [] nums = {4,1,3,12,5,20,13};

        int evenCount = 0, oddCount = 0;

        String evenNums = "", oddNUms = "";

        for(int element: nums)
        {
            if(element % 2 == 0)
            {
                evenCount++; //calculate the number of even numbers
                evenNums += element + " ";
            }
            else {
                oddCount++;
                oddNUms += element + " ";
            }


        }

        System.out.println("Even: " + evenCount);
        System.out.println(evenNums);
        System.out.println("Odd: " + oddCount);
        System.out.println(oddNUms);

    }
}
