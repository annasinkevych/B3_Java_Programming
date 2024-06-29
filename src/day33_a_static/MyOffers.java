package day33_a_static;

import day32_constructor_chaining.Offer;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {
    public static void main(String[] args) {

        Offer first = new Offer("Texas","Google", 125_000, true, 15 );


        ArrayList <Offer> offers = new ArrayList<>();
        offers.add(first);
        offers.add(new Offer("New York", "Amazon", 130_000, true, 20 ));

        Offer second = offers.get(0);
//        System.out.println(offers);

        Offer [] arr = {
                new Offer("Chicago", "Apple", 67_000, false, 20),
                new Offer("Miami", "Google", 160_000, true, 34),
                new Offer("Texas", "Facebook", 125_000, true, 23),
        };
        System.out.println(Arrays.toString(arr));

        //add the values from my array to my arraylist
        offers.addAll(Arrays.asList(arr));
        System.out.println(offers);

        System.out.println("=============================");
        //create another arraylist that is a copy of the first one and remove those offers with salary <130_000
        ArrayList<Offer> offers2 = new ArrayList<>(offers);
        offers2.removeIf(eachOffer-> eachOffer.salary < 130_000);
        System.out.println(offers2);
        //finding full time offers only
        ArrayList<Offer> offers3 = new ArrayList<>(offers);
        offers3.removeIf(each-> !(each.isFullTime));
        System.out.println(offers3);
    }
}
