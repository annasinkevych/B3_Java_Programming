package day18_loops;

public class CountJava {

    public static void main(String[] args) {
        String str = "java is a java language java";

        int countJava = 0;
        //java -- length(); -- 4
        //i < str.length() - 3; -- 12-3 stop looping once index reaches position 9 to not get an out of index error
        for(int i = 0; i < str.length() - 3; i++)
        {
            String everyFour = str.substring(i, i +4);

            if(everyFour.equals("java"))
                countJava++;

        }

        System.out.println(countJava);
    }


}
