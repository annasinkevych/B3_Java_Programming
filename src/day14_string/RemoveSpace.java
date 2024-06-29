package day14_string;

public class RemoveSpace {

    public static void main(String[] args) {
        String str = "    Thursday    ";
        System.out.println(str);

        System.out.println(str.length()); //16 chars with 8 spaces and 8 chars

        str = str.trim(); //removes spaces from beginning of the string and end of the string

        String str2 = "           java is fun      "; //21
        System.out.println(str2.length());
        str2 = str2.trim();
        System.out.println(str2.length() + " characters in: " + str2);


        String str3 = "       loopcamp has SDET program   ";
        System.out.println(str3.startsWith("               loopcamp")); //returns false

        System.out.println(str3.trim());
        System.out.println(str3.length());
        str3 = str3.trim();

        System.out.println(str3);


    }
}
