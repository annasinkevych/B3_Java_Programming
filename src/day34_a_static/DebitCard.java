package day34_a_static;

public class DebitCard {
    //INSTANCE VARIABLES
    long cardNumber;
    String holderName, cardType;
    int pin;
    double balance;

    //STATIC VARIABLES
    static String accountType;

    static {
        accountType = "Checking";
    }

    public DebitCard(long cardNumber, String holderName, double balance) {
        if (String.valueOf(cardNumber).length() != 16)
            System.out.println("INVALID CARD NUMBER");
        else
            this.cardNumber = cardNumber;

        this.holderName = holderName;
        this.balance = balance;
    }

    public DebitCard(long cardNumber, String holderName,String cardType, int pin, double balance) {
        this(cardNumber, holderName, balance);

        if(cardType.equalsIgnoreCase("Mastercard") || cardType.equalsIgnoreCase("Visa"))
            this.cardType = cardType;
        else
            System.out.println("INVALID CARD TYPE");
        if(String.valueOf(pin).length() == 4)
            this.pin = pin;
        else
            System.out.println("INVALID PIN LENGTH - IT HAS TO BE 4 DIGITS");

    }


    @Override
    public String toString() {
        return "DebitCard{" +
                "cardNumber=" + cardNumber +
                ", holderName='" + holderName + '\'' +
                ", cardType='" + (cardType !=null? cardType: "")+ '\'' +
                ", pin=" + pin +
                ", balance=" + balance +
                '}';
    }
}
