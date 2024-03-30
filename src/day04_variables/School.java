package day04_variables;

public class School {

    /*
    Task:

    class name: School

    declare and assign these variables
    number of students in grade 1
    number of students in grade 2
    number of students in grade 3
    number of students in grade 4
    number of students in grade 5

    total number of students in your school

    number of days in a year (have some half day = ~ 100.5)
    number of snow days in a year (double)
    average gpa in school (3.5) [ranges 1.0 - 4.0]

    print all of the variables with unique messages

*/
    public static void main(String[] args)
    {
        int numberOfStudentsInGradeOne = 40,
                numberOfStudentsInGradeTwo = 25,
                numberOfStudentsInGradeThree = 34,
                numberOfStudentsInGradeFour = 19,
                numberOfStudentsInGradeFive = 28;

        double numberOfSchoolDays = 100.5,
                numberOfSnowDays = 5.5,
                averageGpaInSchool = 3.6;

        int totalNumberOfStudents = numberOfStudentsInGradeOne + numberOfStudentsInGradeTwo+ numberOfStudentsInGradeThree + numberOfStudentsInGradeFour + numberOfStudentsInGradeFive;

        System.out.println("The total number of students in all schools is\t" + totalNumberOfStudents);
        System.out.println("The number of school days in a year is\t\t\t" + numberOfSchoolDays);
        System.out.println("The number of snow days in a year is\t\t\t" + numberOfSnowDays);
        System.out.println("The average GPA is\t\t\t\t\t\t\t\t" + averageGpaInSchool);


    }
}
