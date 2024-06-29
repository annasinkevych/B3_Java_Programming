package day43_a_map;

import java.util.*;

public class Coutries {

    public static void main(String[] args) {

        //Map works with --> Key : Value
        //Key" Value (Entry) -> data thas to be primitive (Object type)

        //String, "String, String, String"

        //Key - String, Valuers - ArrayList of String
        //I created a Hashmap
        Map<String, ArrayList<String>> countries = new HashMap<>();
        countries.put("United States", new ArrayList<>(Arrays.asList("New York", "New Jersey", "Virginia")));
        countries.put("France", new ArrayList<>(Arrays.asList("Lyon", "Paris")));
        countries.put("Canada", new ArrayList<>(Arrays.asList("Toronto", "Vancouver", "Ontario")));


        //printing a map, insertion order is not maintained
        System.out.println(countries);//{Canada=[Toronto, Vancouver, Ontario], United States=[New York, New Jersey, Virginia], France=[Lyon, Paris]}

        ArrayList<String> cities = new ArrayList<>(Arrays.asList("New York", "New Jersey", "Virginia", "Toronto", "Vancouver", "Ontario"));
        //System.out.println(cities.get(0));

        //Print all cities which has "i" in it
        for (String each : countries.keySet()) {
            //System.out.println(each); //outputs Canada, United States, France - outputs the key
            //System.out.println(countries.get(each)); //[Toronto, Vancouver, Ontario], [New York, New Jersey, Virginia], [Lyon, Paris] - outputs the value
            for (String city : countries.get(each)) {
                //System.out.println(city);//Toronto, Vancouver, Ontario    New York, New Jersey, Virginia    Lyon, Paris
                if (city.contains("i"))
                    System.out.println(city);//Ontario, Virginia, Paris

            }

        }


        //another way
        for (ArrayList<String> eachCityList : countries.values()) {
            //System.out.println(eachCityList);
            for (String city : eachCityList) {
                if (city.contains("i"))
                    System.out.println(city);//Ontario, Virginia, Paris
            }

        }

        System.out.println("=======================");
        //Lets ask the user which city they want to visit
        System.out.println("Which city do you want to visit?");
        Scanner input = new Scanner(System.in);
        String userWishCity = input.nextLine();

        for (ArrayList<String> cityList : countries.values()) {

            if (cityList.contains(userWishCity)) {
                System.out.println("We have a flight on Sunday");
            }
//            for (String eachCity : cityList) {
//
//                if (eachCity.equalsIgnoreCase(userWishCity)) {
//                    System.out.println("We have a flight on Sunday");
//                    break;
//                }
//            }
        }

    }
}
