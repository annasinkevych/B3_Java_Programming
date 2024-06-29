package day32_constructor_chaining;

public class Offer {

    String location;
    String company;
    public double salary;
    public boolean isFullTime;
    int numberOfPTO;

    public Offer(String location, String company)
    {
        this.location = location;
        this.company = company;
    }

    public Offer(String location, String company, double salary)
    {
        this.location = location;
        this.company = company;
        this.salary = salary;
    }

    public Offer(String location, String company, double salary, boolean isFullTime, int numberOfPTO) {
        this.location = location;
        this.company = company;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTO = numberOfPTO;
    }

    @Override
    public String toString() {

        String info = "\n" + company + " is located in " + location;

        info += "\n" + (salary > 0 ? salary : "");

        info += "\n" + (isFullTime ? "Full Time" : "");

        info += "\n" + (numberOfPTO > 0 ? numberOfPTO : "");
return info;
//        return "Offer: " +
//                "location='" + location + '\'' +
//                ", company='" + company + '\'' +
//                ", salary=" + salary +
//                ", isFullTime=" + isFullTime +
//                ", numberOfPTO=" + numberOfPTO;
    }

    public static void main(String[] args) {
        Offer obj = new Offer("New York", "Apple", 120_000.00,true, 30);

        System.out.println(obj);

    }
}
