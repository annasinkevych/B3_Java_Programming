package day21_arrays;

public class InitialsAndArrays {

    public static void main(String[] args) {

        String [] names = {"James Bond ", " eve Rell", " Anna johnson "};


        for (int i = 0; i < names.length; i++) {
            String eachFullName = names[i].trim();
            String eachLastName = eachFullName.substring(eachFullName.indexOf(" ")).trim(); // _Bond - _Rell
//            String eachLastName = eachFullName.substring(eachFullName.indexOf(" ")+1); // _Bond - _Rell

            //System.out.println(eachFullName);
            //System.out.println(eachLastName);

            String initial = (eachFullName.charAt(0)+"").toUpperCase() + (eachLastName.charAt(0) + "").toUpperCase();
            System.out.println(initial);

            //System.out.println((names[i].trim().charAt(0)+"").toUpperCase() + (names[i].trim().substring(eachFullName.indexOf(" ")).trim().charAt(0)+"").toUpperCase());

        }


        // This is same but used foreach loop
        for ( String each : names) {
            String eachFullName = each.trim();
            String eachLastName = eachFullName.substring(eachFullName.indexOf(" ")).trim(); // _Bond - _Rell
//            String eachLastName = eachFullName.substring(eachFullName.indexOf(" ")+1); // _Bond - _Rell

            //System.out.println(eachFullName);
            //System.out.println(eachLastName);

            String initial = (eachFullName.charAt(0)+"").toUpperCase() + (eachLastName.charAt(0) + "").toUpperCase();
            System.out.println(initial);

            //System.out.println((names[i].trim().charAt(0)+"").toUpperCase() + (names[i].trim().substring(eachFullName.indexOf(" ")).trim().charAt(0)+"").toUpperCase());

        }
    }
}
