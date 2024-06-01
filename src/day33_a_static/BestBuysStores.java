package day33_a_static;

public class BestBuysStores {
    public static void main(String[] args) {


        //ANYTHING STATIC SHOULD ALWAYS BE CALLED BY CLASS NAME



        BestBuy store1 = new BestBuy("Fairfax, VA");
        BestBuy store2 = new BestBuy("Bergenfield, NJ");
        BestBuy store3 = new BestBuy("Boston, MA");

        System.out.println(BestBuy.headQuarters);
        store1.headQuarters = "Tysons, 123 Test St, VA, United States";
        store3.location = "Manhattan, NY";
        System.out.println(store1.location);
        System.out.println(store2.location);
        System.out.println(store3.location);

        System.out.println(store1.headQuarters);
        System.out.println(store2.headQuarters);
        System.out.println(store3.headQuarters);

        System.out.println("====================================");

        store1.operStore();
        store2.operStore();
        store3.operStore();
        System.out.println("====================================");
        BestBuy.reStock();
    }


}
