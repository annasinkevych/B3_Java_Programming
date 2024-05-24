package day29_arraylist;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class JobTitles {

    public static void main(String[] args) {
        ArrayList<String> jobTitles = new ArrayList<>();

//        int [] arr = new int [6];
//
        jobTitles.addAll(Arrays.asList("SDET", "Developer", "QA", "QE","PO", "DevOps", "CEO", "BA", "Qr"));
        //jobTitles.add(Arrays.asList("SDET", "Developer", "QA", "QE","PO", "DevOps", "CEO", "BA", "Qr"));
        System.out.println("Original: " + jobTitles);


        ArrayList <String> jobs1 = new ArrayList <> (jobTitles);

        jobs1.removeAll(Arrays.asList("QA", "QE", "PO"));//removes all given elements at all matches even duplicates


        jobs1.retainAll(Arrays.asList("SDET", "DevOps", "CEO"));
        System.out.println(jobs1); //[SDET, DevOps, CEO]


        ArrayList <String> job3 = new ArrayList<>(jobTitles);
        //order doesn't matter
        System.out.println(job3.containsAll(Arrays.asList("DevOps", "Dr")));//false
        System.out.println(job3.containsAll(Arrays.asList("SDET", "Developer", "QA")));//true
        System.out.println(job3.containsAll(Arrays.asList("SDET","QA", "Developer")));//true

    }
}
