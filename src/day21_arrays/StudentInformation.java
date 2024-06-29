package day21_arrays;

import java.util.Arrays;
import java.util.Scanner;

public class StudentInformation {

    public static void main(String[] args) {
        String [] student1 = {"AB001", "Tom", "Jerry", "B#03"};
        System.out.println(Arrays.toString(student1));

        String [] student2 = new String[4];
        student2[1] = "Winnie";
        student2[3] = "B#03";
        student2[0] = "AB002";
        System.out.println(Arrays.toString(student2)); //the default value for a String is null if there was no other value provided
        student2[2] = "Pooh";
        System.out.println(Arrays.toString(student2));

        String [] student3 = new String[4];

        Scanner key  = new Scanner(System.in);
//        System.out.println("Enter your student ID: ");
//        student3[0] = key.nextLine();
//        System.out.println("Enter your name: ");
//        student3[1] = key.nextLine();
//        System.out.println("Enter your last name: ");
//        student3[2] = key.nextLine();
//        System.out.println("Enter your batch number: ");
//        student3[3] = key.nextLine();
//
//        System.out.println(Arrays.toString(student3));

        String [] questions = {"Enter your student ID:", "Enter your name:", "Enter your last name:", "Enter your batch number:"}
;        String [] student4 = new String[4];

        for(int i = 0; i < questions.length; i++)
        {
            System.out.println(questions[i]);
            student4[i] = key.nextLine();
        }

        System.out.println(Arrays.toString(student4));

    }
}
