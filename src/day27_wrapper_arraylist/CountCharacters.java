package day27_wrapper_arraylist;

public class CountCharacters {

    //aP3d572&*jd@jdJU

    public static void main(String[] args) {

        String str = "aP3d572&*jd@jdJU";


        int upper = 0, lower = 0, digit = 0, others = 0;

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if(Character.isUpperCase(each)) //.isUpperCase(ch) --> returns boolean
                upper++;
            else if(Character.isLowerCase(each))
                lower++;
            else if(Character.isDigit(each))
                digit++;
            else
                others++;
        }

        System.out.println("Upper case letters count: " + upper);
        System.out.println("Lower case letters count: " + lower);
        System.out.println("Digits count: " + digit);
        System.out.println("Other letters count: " + others);
    }
}
