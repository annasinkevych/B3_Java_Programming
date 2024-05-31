package day32_constructor_chaining;

public class EmployeeV2 {

        String name, jobTitle;
        int id;
        double salary;


        public EmployeeV2(String name, String jobTitle)
        {
            //initializing the instance variable "name" with the value passed as a parameter to the local "name" variable.
            this.name = name;
            this.jobTitle = jobTitle;
        }

        public EmployeeV2(String name, int id)
        {
            this.name = name;
            this.id = id;
        }
        //OVERLOADED CONSTRUCTORS
//        public EmployeeV2(int id, String name)
//        {
//            this.name = name;
//            this.id = id;
//        }

        public EmployeeV2(String name, int id, String jobTitle, double salary)
        {
//          this.name = name;
//          this.jobTitle = jobTitle;
            //calls one of the above constructors which assigns 2 variables, no need to write the same code multiole times
            this(name, jobTitle);
            this.id = id;

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
