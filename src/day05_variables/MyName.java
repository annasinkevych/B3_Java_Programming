package day05_variables;

public class MyName {

    public static void main (String[] args) {
        char first = 'a';
        char second = 'n';
        char third = 'n';
        char fourth = 'a';


        System.out.println(first); //prints out character
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);

        System.out.println("First =" + first); //prints out character
        System.out.println("Second =" + second);
        System.out.println("Third =" + third);
        System.out.println("Fourth =" + fourth);

        System.out.println();
        System.out.println(first + second + third + fourth); //prints value 414
        System.out.println(first + second + "" + third + fourth);//prints 207na

        int nameValue = (first + second + third + fourth);
        String name = "" + first + second + third + fourth; //"" makes it a string and you can use concatination in the string var declaration and assignment

        System.out.println(name);
        System.out.println(nameValue); //prints int 414

        char let = 1243;
        System.out.println(let);
        //or
        char let2 = 'ꮀ';
        System.out.println(let2);






    }

}
