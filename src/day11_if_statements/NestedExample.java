package day11_if_statements;

public class NestedExample {

    public static void main(String[] args) {
        boolean a = true,
                b = false,
                c = true;


        if(a)
        {
            System.out.println(1);
            if(b) //not false --> true
            {
                System.out.println("You are inside the nested if");

                if(c)
                {
                    System.out.println("You are inside another nested if");
                }
            }
        }
    }
}
