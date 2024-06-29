package day33_a_static;

import java.util.Arrays;

public class LoopCampStudent {

    String name;
    int groupNumber;

    static int batchNumber;
    static String [] teachers;
    static String schoolName;


    // STATIC BLOCK - it run ONLY ONE TIME
    static {
        batchNumber = 3;
        teachers = new String[]{"Nadir", "Feyruz", "James", "Diana"};
        schoolName = "Loopcamp";
        //printInfo();
    }


    public static void printInfo(){
        System.out.println("School Info: ");
        System.out.println("\tSchool Name: " + schoolName );
        System.out.println("\tBatch Number: " + batchNumber);
        System.out.println("\tTeachers: " + Arrays.toString(teachers));
        //System.out.println("Name: " + name ); // CANNOT USE INSTANCE IN STATIC
    }


    public LoopCampStudent (String name, int groupNumber) {
        this.name = name;
        this.groupNumber = groupNumber;
    }

    @Override
    public String toString() {
        return "Loopcamp Student Info: " +
                "\n\tName: " + name +
                "\n\tGroup Number:"  + groupNumber;
    }

}
