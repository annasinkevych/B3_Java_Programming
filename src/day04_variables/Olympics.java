package day04_variables;

public class Olympics {
    /*
class name Olympics

    create a variable for the year
    print the country and year for next couple events
    reassign year value each time. Country name is hard coded

    data:

        China 2022
        France 2024
        Italy 2026

    Look forward to the year $year for the Olympics to be in $location

 */

    public static void main(String[] args) {
        int year;
        String country = "China", country1 = "France", country2 = "Italy";
        year = 2022;
        System.out.println("Looking forward to the year " + year + " for the Olympics to be in " + country);
        year = 2024;
        System.out.println("Looking forward to the year " + year + " for the Olympics to be in " + country1);
        year = 2026;
        System.out.println("Looking forward to the year " + year + " for the Olympics to be in " + country2);

    }
}
