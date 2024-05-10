package day23_multidimensionalArrays;

import java.util.Arrays;

public class Groups {

    public static void main(String[] args) {


        String [] [] groups = new String [4][]; //2d array will hold a total of 4 Single dimensional arrays
        String [] [] groups2 = new String [4][3]; //2d array will hold a total of 4 Single dimensional arrays which wil gold 3 elements each
        System.out.println(Arrays.deepToString(groups));
        System.out.println(Arrays.deepToString(groups2));

        String [] groupTwo = {"Diliara", "Laura", "Alex"};
        groups[0] = groupTwo;
        System.out.println(Arrays.deepToString(groups));
        String [] groupThree = {"Alona", "Roma", "Kanan"};
        groups[2] = groupThree;
        System.out.println(Arrays.deepToString(groups));

        groups[1] = groups[0];
        System.out.println(Arrays.deepToString(groups));

        groups[3] = new String []{"John", "Mocky"};


        for (int i = 0; i <groups.length ; i++) {

            for (int j = 0; j < groups[i].length; j++) {
                System.out.println(groups[i][j]);
            }

        }

        //or print like this
//        [Diliara, Laura, Alex]
        //[Diliara, Laura, Alex]
        // [Alona, Roma, Kanan]
//[John, Mocky]

        for(String [] each: groups)
        {
            System.out.println(Arrays.toString(each));
        }

        //print names with for each

        for(String [] each: groups) //this will loop through each single array elements
        {
            for(String element: each)
            {
                System.out.println(element);
            }
            System.out.println();
        }


    }
}
