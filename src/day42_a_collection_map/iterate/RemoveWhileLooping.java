package day42_a_collection_map.iterate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveWhileLooping {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(2, 3, 5, 6, 7, 8, 9 ,1, 5));
        //traditional loop with removing, will cause issue because indexes get shifted to left. So it will skip some

        for (int i = 0; i < list.size() ; i++) {
            if(list.get(i)<5)
                list.remove(i);
        }
        System.out.println(list);

        for (Integer each: list){
            if(each <5)
                list.remove(each); //ConcurrentModificationException
        }

        //System.out.println(list);


    //with Iterator
    Iterator <Integer> iterator = list.iterator();
    while (iterator.hasNext()){
        if(iterator.next()<5)
            iterator.remove(); //removing the element from list if my if condition is true
    }

    }
}
