package day07_relational_operators;

public class UpdateVariable {

    public static void main(String[] args) {
        int a = 10;
        a = 11; //re-assigning a new value

        a++; //re-assigning a value by post-incrementing it by 1

        ++a; //re-assigning a value by pre-incrementing a value by 1

        a = a + 1; //re-assigning a new value by adding 1 to it

        //add 10

        a += 10; //re-assigning a by adding 10 to it

        a *=10;

        System.out.println(a);

        a %= 10;

        System.out.println(a);

        a /= 2;

        System.out.println(a);


    }
}
