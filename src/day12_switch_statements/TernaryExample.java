package day12_switch_statements;

public class TernaryExample {

    public static void main(String[] args) {
       //if the first expression is false then it will evaluate the expression in false and print whatever the result is
        String result = (5<9) ? "Loopcamp": (4 > 2)? "Hello": "Bye";


        String result1 = (5<9) ? "Loopcamp": (4 > 2)? "Hello": ( 5 ==5) ? "Test1" : "Test2";



    }
}
