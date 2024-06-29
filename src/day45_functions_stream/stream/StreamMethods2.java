package day45_functions_stream.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class StreamMethods2 {

    public static void main(String[] args) {
        //7 - map()

        List<Integer> list4 = new ArrayList<>(Arrays.asList(1, 2, 3,4 ,5 ,6 ,7 ,8 ,9 ,10 ,11 ,12 ));

        //list4.stream().map() - .map() is just a method
        //Here .map() works with Function - functional interface which accepts one Object and doesn't return

        //let's say i want to take each element from arraylist and multiply it by 2 and reassign the arraylist
        list4 = list4.stream().map((e)-> e * 2).collect(Collectors.toList());
        System.out.println(list4);


        //Task: keep the abbreviations of the days
        List <String> list5 = new ArrayList<>(Arrays.asList("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"));
        System.out.println(list5);
        list5 = list5.stream().map(day -> day.substring(0,3).toUpperCase()).collect(Collectors.toList());
        System.out.println(list5);//[MON, TUE, WED, THU, FRI, SAT, SUN]


        //#8 - .filter() -- Accepts Predicate --> accepts 1 Object and returns a boolean

        List <Integer> list6 = new ArrayList<>(Arrays.asList(1, 2, 3,4 ,5 ,6 ,7 ,8 ,9, 10 ));

        //Task: I want to get all even numbers and store into int List

        System.out.println("Original List: " + list6);
        List<Integer> even = list6.stream().filter(eachNum -> eachNum % 2 ==0).collect(Collectors.toList());
        System.out.println("List with even number only " + even);
        List<Integer> odd = list6.stream().filter(eachNum -> eachNum % 2 == 1).collect(Collectors.toList());
        System.out.println("List with odd number only " + odd);


        //What happens in the background of filter() method
        Predicate<Integer> e = n->{
            if(n%2==0){
                return true;
            }
            else
                return false;
        };

        List <Integer> even2 = new ArrayList<>();
        for(Integer each: list6)
        {
            if(e.test(each))
            {
                even2.add(each);
            }
        }

        System.out.println(even2);


        //How many even numbers we have
        System.out.println(list6.stream().filter(each -> each % 2==0).count());
        //count even without duplicate numbers
        System.out.println(list6.stream().filter(each -> each % 2==0).distinct().count());



        // #8 - forEach()
        System.out.println("***************");
        List<Integer> list7 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 2, 4, 6, 8));
        //list4.stream().forEach();
        // Here .forEach() works with Consumer - functional interface which accepts ONE Object and does NOT return
        list7.stream().filter(p -> p % 2 == 0).forEach(each -> System.out.println(each));
        System.out.println();
        list7.stream().filter(p -> p % 2 == 0).forEach( System.out::println); // It is shortcut for print statement that work with Consumer (no return)

    }
}
