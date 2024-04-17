package day12_switch_statements;

public class NumberWords {

    public static void main(String[] args) {
        int num = 3;

        //with switch we cannot use relational operators (<=, >=!=, ==), doesn't work with double
        //works with String, char, int, short, byte
        switch(num)
        {
            case 1: System.out.println("You've entered number 1");
                break;

            case 2: System.out.println("You've entered number 2");
                break;

            case 3: System.out.println("You've entered number 3");
                break;

            case 4: System.out.println("You've entered number 4");
                break;
            default:
                System.out.println("Your number is not within the range");

        }
    }
}
