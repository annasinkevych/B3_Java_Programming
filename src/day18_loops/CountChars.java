package day18_loops;

public class CountChars {

    public static void main(String[] args) {

        String str = "2juMp41EEkd4s4";
        int upperCount = 0, loweCount = 0, numCount = 0;

        for(int i = 0; i < str.length(); i++)
        {
            char eachLetter = str.charAt(i);

            if(eachLetter >= 'A' && eachLetter <= 'Z')
                upperCount++;
            else if(eachLetter >= 'a' && eachLetter <= 'z')
                loweCount++;
            else if(eachLetter >= '0' && eachLetter <= '9')
                numCount++;
        }

    }
}
