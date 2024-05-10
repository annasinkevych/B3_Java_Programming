package day23_multidimensionalArrays;

import java.rmi.UnexpectedException;
import java.util.Arrays;
import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("How many elements in your first array you want to have: ");
        //int firstArraySize = key.nextInt();
        int[] firstArr = new int[key.nextInt()];

        System.out.println("Please, enter your number of element one by one pressing enter: ");
        for (int i = 0; i < firstArr.length; i++) {
            //System.out.println("Enter your data/value: ");
            firstArr[i] = key.nextInt();
        }
        System.out.println("First array: " + Arrays.toString(firstArr));//First array: [1, 2, 3]
        System.out.println("How many more elements do you want your Second Array store compared to First Array: "); //6
        //int numsToAdd = key.nextInt();
        int [] secondArrd = Arrays.copyOf(firstArr, firstArr.length + key.nextInt());

        System.out.println(Arrays.toString(secondArrd)); //[1, 2, 3, 0, 0, 0]

        //adding new elements into our second array --> the starting point is the first array length
        for (int i = firstArr.length; i <secondArrd.length ; i++) {
            secondArrd[i] = key.nextInt();
        }
        System.out.println("Second array: " + Arrays.toString(secondArrd));
    }
}
