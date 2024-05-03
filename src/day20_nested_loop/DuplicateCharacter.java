package day20_nested_loop;

public class DuplicateCharacter {

    public static void main(String[] args) {
        String str = "appleee";
        String checked = "";
//TODO: debug this code
        for(int i = 0; i < str.length(); i++)
        {
            char each1 = str.charAt(i);
            int count = 0;
            if(checked.contains(each1 + ""))
                continue;
            for(int j = 0; j < str.length(); j++)
            {
                char each2 = str. charAt(j);
                if(each1 == each2)
                    count++;
            }

            //prints duplicates only
            if(count >1)
                System.out.println(each1);

            checked += each1;
        }
    }
}
