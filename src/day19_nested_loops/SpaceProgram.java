package day19_nested_loops;

public class SpaceProgram {

    public static void main(String[] args) {


        String str = "more words";

        String result = "";


        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == ' ')
                result += "_ ";
            else
                result += str.charAt(i) + " ";
        }

        System.out.println(result.trim());


    }
}
