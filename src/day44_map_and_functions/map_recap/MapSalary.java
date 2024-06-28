package day44_map_and_functions.map_recap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapSalary {

    public static void main(String[] args) {
        Map<String, Double> map = new HashMap<>();

        map.put("Jeyhun", 115_000.00);
        map.put("Gedi", 110_000_000.00);
        map.put("Elina", 123_000_000.00);
        map.put("OlexsanderS", 140_000_000.00);
        map.put("OlexsanderM", 170_000_000.00);
        map.put("Laura", 190_000_000.00);

        //Find the person with the lowest salary

        double max = Double.MIN_VALUE;
        double min  = Double.MAX_VALUE;
        String name = "";
        for(Map.Entry<String, Double> eachPair: map.entrySet())
        {
            if(eachPair.getValue() > max)
            {
                max = eachPair.getValue();
                name = eachPair.getKey();
            }
        }

        System.out.println(name + " has the largest salary: " + map.get(name));


        //find for this data how many people make a salary between $130k - $150k
        int counter = 0;
        for(Double eachSalary: map.values())
        {
            if(eachSalary >= 130_000_000.00 && eachSalary <= 150_000_000.00){
                counter++;
            }
        }


        //find the names of people who make less than $130k

        List<String> listOfNames = new ArrayList<>();

        for(String eachName: map.keySet()){
            if(map.get(eachName) <= 130_000_000.00){
                listOfNames.add(eachName);
            }
        }

        System.out.println(listOfNames.toString().replace("[", "").replace("]", "") + " makes salary less than $130_000_000.00");


        //increased the salary for everyone by $10k
        for(String eachN: map.keySet())
        {
            map.put(eachN, map.get(eachN)+ 10_000_000.00) ;
        }

        System.out.println(map);




        //Find the person name and the salary who is making the HIGHEST SALARY and LOWEST SALARY
        // MAX SALARY: $name - $$salary
        // MIN SALARY: $name - $$salary


        String namForHighestSalary = "";
        double maxSalary = 0.0;


        String namForLowestSalary = "";
        double minSalary = Double.MAX_VALUE; //1.7976931348623157E308


        //[100000.0, 120000.0, 135000.0, 125000.0, 105000.0, 130000.0, 110000.0, 140000.0]

        for (String eachName : map.keySet()){

            //System.out.println("Each Name: " + eachName);
            //System.out.println("Each related salary: " + map.get(eachName));
            //System.out.println();

            double salaryForEachName = map.get(eachName);

            if (salaryForEachName > maxSalary) {
                maxSalary = salaryForEachName;
                namForHighestSalary = eachName;
            }

            if (salaryForEachName < minSalary){
                minSalary = salaryForEachName;
                namForLowestSalary = eachName;
            }

        }

        System.out.println("MAX SALARY: " + namForHighestSalary + " - $" + maxSalary);
        System.out.println("MIN SALARY: " + namForLowestSalary + " - $" + minSalary);

        System.out.println("----------------------------");
        // Find for these data, how many people make salary between 130K and 160K (both inclusive)
        // $number of people makes salary between 130K and 160K
        int counter1 = 0;

        for (Double eachSalary : map.values()) {
            if ( eachSalary >= 130_000.00 && eachSalary <= 160_000){
                counter1++;
            }
        }
        System.out.println(counter1 + " of people makes salary between 130K and 160K");


        System.out.println("----------------------------");
        // Find me the names who makes salary less than 130K
        // $name1, $name2 ... makes salary less than 130K

        List <String> allName = new ArrayList<>();
        for ( String eachName : map.keySet()) {
            if (map.get(eachName) < 130_000.00) {
                allName.add(eachName);
            }
        }
        System.out.println(allName.toString().replace("[", "").replace("]","") +
                " makes salary less than 130K" );

        System.out.println("----------------------------");
        // Increase the salary for every one by $10K in the data structure (map)
        System.out.println("Before Increase: " + map.values());
        for ( String eachName: map.keySet()) {
            map.put(eachName, map.get(eachName) + 10_000.00);
        }
        System.out.println("After Increase: " + map.values());

    }





}
