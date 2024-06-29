package day20_nested_loop;

public class ContinueInNested {

    public static void main(String[] args) {


        for (int i = 0; i < 5; i++) {

            if(i == 1 )
            {
                continue;
            }
            System.out.println("i: " + i);
        }
    }
}
