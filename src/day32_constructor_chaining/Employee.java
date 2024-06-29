package day32_constructor_chaining;

public class Employee {

    String name, jobTitle;
    int id;
    double salary;


    public Employee(String name, String jobTitle)
    {
        //initializing the instance variable "name" with the value passed as a parameter to the local "name" variable.
        this.name = name;
        this.jobTitle = jobTitle;
    }

    public Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }
    //OVERLOADED CONSTRUCTORS
    public Employee(int id, String name)
    {
        this.name = name;
        this.id = id;
    }

    public Employee(String name, int id, String jobTitle, double salary)
    {
        this.name = name;
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString()
    {
        return  "Employee: \nName: " + name + "\nID: " + id + "\nJob Title: " + jobTitle + "\nSalary: " + salary;
    }

    public void goToMeeting() {
        System.out.println(name + " is going to a meeting.");
    }

//    public void

}
