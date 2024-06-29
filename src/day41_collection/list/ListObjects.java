package day41_collection.list;

//imports all util classes for all collection types data structures
import java.lang.reflect.Array;
import java.util.*;

public class ListObjects {

  public static void main(String[] args){

      //Two ways to declare and assin a list
      ArrayList<String> list = new ArrayList<>();
      List<String> list2 = new ArrayList<>();

      list2.add("A");
      list2.add("B");
      list2.add("C");
      list2.add("D");
      list2.add(null);
      System.out.println(list2); //[A, B, C, D, null]
      System.out.println(list2.get(3));

      Collections.reverse(list2);
      Collections.sort(list2);

      System.out.println("=============================");
      List<String> list3 = new LinkedList<>();
      list3.add("A");
      list3.add("B");
      list3.add("C");
      list3.add("D");
      list3.add(null);
      System.out.println(list3); //[A, B, C, D, null]
      System.out.println(list3.get(3));

      List<String> list4 = new Vector<>();
      list4.add("A");
      list4.add("B");
      list4.add("C");
      list4.add("D");
      list4.add(null);
      System.out.println(list4); //[A, B, C, D, null]
      System.out.println(list4.get(3));


      int [] arr1 = new int [4];
      int [] arr2 = Arrays.copyOf(arr1, arr1.length+2);
      System.out.println(Arrays.toString(arr2)); //[0, 0, 0, 0, 0, 0]


  }
}
