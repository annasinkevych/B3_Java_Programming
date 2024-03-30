package day03_comments_escape_sequence;

public class VariableIntro {
    public static void main(String[] args)
    {
        int quantity = 1;
        int quantity1 = 10;
        char letter =  'a';
        boolean var1 = true;
        boolean var2 = false;
        int result;

        result = quantity + quantity1;
        System.out.println(result);
        System.out.println(var1);
        System.out.println(var2);

        quantity = 4; //reassigning the same variable name with a different value
        System.out.println(quantity);
    }
}
