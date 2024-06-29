package day24_custom_methods;

public class Email {

    public static void main(String[] args) {

        buildEmail("Mickly Mouse", "gmail.com");
    }

    public static void buildEmail(String str, String domain)
    {
        String email = "" + str.charAt(0) + str.substring(str.indexOf(" ") + 1) + "@" + domain.toLowerCase() ;
        System.out.println(email);
    }

}
