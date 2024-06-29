package day20_nested_loop;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "a gentleman";
        String str2 = "elegant man";

        str1 = str1.toLowerCase().replaceAll(" ", "");
        str2 = str2.toLowerCase().replaceAll(" ", "");

        System.out.println(str1);
        System.out.println(str2);
        String checked = "";
        if(str1.length() == str2.length()) {
//            for (int i = 0; i < str1.length(); i++) {
//                for (int j = 0; j < str2.length(); j++) {
//                    if (str1.charAt(i) == str2.charAt(j)) {
//                        checked = str1.replaceFirst("" + str2.charAt(j), " ");
//                    }
//                }
//            }

            for (int i = 0; i < str1.length() ; i++) {
                char each = str1.charAt(i);
                str2 = str2.replaceFirst(each+"", "");
            }

            if(str2.isEmpty())
                System.out.println("Anagram");
        }
        else
            System.out.println("Not Anagram");

    }
}
