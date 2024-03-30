package day05_variables;

public class EmployeeInfo {

    public static void main(String[] args) {

        //declare variables
        String firstName, lastName, companyName, jobTitle;
        boolean fullTime, maritalStatus;
        char gender, suite;
        int age, pto;
        double salary;

        //assign variables
        firstName = "Anna";
        lastName = " Nicol";
        companyName = "Apple";
        jobTitle = "SDET";
        fullTime = true;
        maritalStatus = true;
        gender = 'F';
        suite = 'A';
        age = 30;
        pto = 40; //Paid Time OFF
        salary = 200_000;


        String fullDetail = "Employee Information for: " + firstName + lastName + "\nCompany Name: " + companyName + "\nJob Title: " + jobTitle +"\nFull Time: " + fullTime +"\nMarital Status: " + maritalStatus + "\nGender: " + gender +"\nSuite: " + suite + "\nAge: " + age + "\nPTO: " + pto + "\nSalary: " + salary;

        System.out.println(fullDetail);







    }
}
