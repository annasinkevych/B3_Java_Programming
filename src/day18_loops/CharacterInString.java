package day18_loops;

public class CharacterInString {

    public static void main(String[] args) {
        String str = "java";

        for(int i = 0; i < str.length(); i++)
        {
            System.out.println((int)str.charAt(i));
        }
    }
}
