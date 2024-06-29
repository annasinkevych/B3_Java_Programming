package day19_nested_loops;

public class ReverseMiddle {

    public static void main(String[] args) {

        String str = "You love java";

        int firstSpaceIndex = str.indexOf(" ");
        int lastSpaceIndex = str .lastIndexOf(" ");

        String middle = str.substring(firstSpaceIndex +1, lastSpaceIndex);//love
        String reversed = " ";

        for (int i =  middle.length()-1; i >=0; i--) {
            reversed += middle.charAt(i);
        }

        System.out.println(str.substring(0,firstSpaceIndex) + reversed + str.substring(lastSpaceIndex));
        System.out.println(reversed.trim());
    }
}
