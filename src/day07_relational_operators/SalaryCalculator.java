package day07_relational_operators;

public class SalaryCalculator {

    public static void main(String[] args)
    {
        double salary = 100_000,
               stateTaxRate = 0.08, //8%
               federalTaxRate = 0.21, //21
               stateTax,
               federalTax,
               totalTax,
               salaryAfterTax;


        stateTax = salary * stateTaxRate;
        federalTax = salary * federalTaxRate;
        totalTax = stateTax + federalTax;
        salaryAfterTax = salary - totalTax;


        String completeStatement = "State tax rate: " + stateTaxRate + "\nFederal tax rate: " + federalTaxRate + "\nSalary before tax: " + salary + "\nTax amount: \n\tState tax $" + stateTax + "\n\tFederal tax $" + federalTax + "\n\tYour total tax is $" + totalTax + "\nYour salary after tax is $ " + salaryAfterTax;

        System.out.println(completeStatement);
        System.out.println();
        System.out.println("completeStatement = " + completeStatement); //prints variable name




    }

}
