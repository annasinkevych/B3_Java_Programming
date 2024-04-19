package day14_string;

public class Contains {

    public static void main(String[] args) {
        String weather = "Today it was above 70";

        System.out.println(weather.contains("it was"));//true
        System.out.println(weather.contains("s"));//true
        System.out.println(weather.contains("a"));//true
        System.out.println(weather.contains("it was"));//true
        System.out.println(weather.contains("itwas")); //false
        System.out.println(weather.contains("above 70")); //true
        System.out.println(weather.contains("above 7O")); //false 70 is with an O not 0

        System.out.println(weather.contains("today")); //false because case is different lowercase instead of uppercase

        System.out.println(weather.contains("Today") || weather.contains("70"));

    }
}
