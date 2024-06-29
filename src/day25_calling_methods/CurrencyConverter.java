package day25_calling_methods;

public class CurrencyConverter {



    public static void main(String[] args)
    {
        System.out.println(convert("euro", 150));
    }

    /**
     * method that returns a converted currency
     * @return returns currency converted to US dollars
     */
    public static double convert(String currency, double amount)
    {
        switch(currency.toLowerCase())
        {
            case "euro":
                return amount * 0.92;
            case "yen":
                return amount * 154.17;
            case "lira":
                return amount * 32.17;
            case "won":
                return amount * 1_353.43;
            case "rupee":
                return amount * 83.40;
            default:
                return 0.0;
        }
    }
}
