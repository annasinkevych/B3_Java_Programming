package day24_custom_methods;

public class OurArrayClass {

    public static void arrFirstArray(int [] arr)
    {
        System.out.println("First element: " + arr[0]);
    }

    public static void arrLastElement(int [] arr)
    {
        System.out.println("Last Element: " + arr[arr.length -1]);
    }

    public static void arrMidElems(int [] arr)
    {
        if(arr.length % 2 == 0)
        {
            System.out.println("Middle first: " + arr[arr.length/2-1]);
            System.out.println("Middle second: " + arr[arr.length/2]);
        }
        else
        {
            System.out.println("Middle: " + arr[arr.length/2]);
        }
    }


    public static void main(String[] args) {
        int [] numbers = {10, 4, 4,12,56,7,7,8};
        int [] numbers2 = {1034, 24234, 2358934,234412,909756,8737,9823947,234442};

        int [] numbers3 = new int [3];
        int [] numbers4 = {1034, 23452, 234, 331, 2234, 0, 54}; // 7 - > 331 -- > 7/2 -- > 3
        int [] numbers5 = {1034, 23452, 234, 331, 2234, 0, 54, 65}; // 8 - > 331, 2234 --- > 8/2-1 --- > 3 , 8/2 --- > 4

        arrFirstArray(numbers);
        arrLastElement(numbers);
        arrFirstArray(numbers2);
        arrLastElement(numbers2);
        System.out.println();
        arrFirstArray(numbers3);
        arrLastElement(numbers3);

        System.out.println();
        arrMidElems(numbers4);
        arrMidElems(numbers5);
    }
}
