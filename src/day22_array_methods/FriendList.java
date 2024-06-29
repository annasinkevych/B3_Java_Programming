package day22_array_methods;

import java.util.*;

public class FriendList {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);

        System.out.println("How many friends do you want to save: ");
        int friendsCount = key.nextInt();

        String [] friendList = new String[friendsCount];
        //or
        //String [] friendList2 = new String[key.nextInt()];

        key.nextLine();
        for(int i = 0; i < friendList.length; i++)
        {
            System.out.println("Enter your friend name: ");
            String eachInfo = key.nextLine().toLowerCase();
            friendList[i] = eachInfo.substring(0,1).toUpperCase() + eachInfo.substring(1);
        }

        System.out.println("I have " + (friendList.length) + " friends.");
        System.out.println("Their names are: " );
        for(String each: friendList)
        {
            System.out.println("\t" + each);
        }


    }
}
