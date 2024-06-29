package day32_constructor_chaining;

public class Company {

    public static void main(String[] args) {

        Employee newEmployee = new Employee("Feyruz", 34567, "SDET", 120_000);
        System.out.println(newEmployee);
    }
}
