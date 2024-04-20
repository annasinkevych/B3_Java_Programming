package day15_string;

public class EmptyOrBlank {

    public static void main(String[] args) {

        String str = "new example";

        System.out.println(str.isEmpty()); //returns false, checks if the string has no characters

        String str2 = "";

        System.out.println(str2.isBlank());//returns true, checks if the string has no characters including space

        String str3 = "       ";

        System.out.println(str3.isBlank());//returns true, contains no words but contains lots of spaces

        System.out.println(str3.isEmpty()); //false, because no characters but many spaces


        if(str.length() == 0)
            System.out.println("no characters");

        String s2 = "    ";
        //.isEmpty()
        System.out.println(s2.isEmpty()); //returns false because it also contains spaces
        //,isBlank();
        System.out.println(s2.isBlank());//returns true because it only contains spaces and not other value


    }
}
