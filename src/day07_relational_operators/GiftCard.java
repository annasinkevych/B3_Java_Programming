package day07_relational_operators;

public class GiftCard {

    public static void main(String[] args) {

        double giftCardBalance = 200,
               item1Price = 100,
               item2Price = 40;



        System.out.println("Gift card balance is: $" + giftCardBalance);
        System.out.println(" Buy Item 1 price: $" + item1Price);
        giftCardBalance -= item1Price; //using shorthand operator
        System.out.println("After purchasing item 1 my Gift Card balance is: $ " + giftCardBalance);
        System.out.println("Item 2 price: $" + item2Price);
        giftCardBalance -= item2Price;
        System.out.println("After purchasing item 2 my Gift Card balance is: $ " + giftCardBalance);


    }
}
