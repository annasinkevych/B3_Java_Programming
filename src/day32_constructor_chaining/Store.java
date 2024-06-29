package day32_constructor_chaining;

import java.util.Arrays;

public class Store {

    public static void main(String[] args) {

        Food food1 = new Food("Apple");
        System.out.println(food1);

        Food food2 = new Food("Chips", 2);
        System.out.println(food2);
        food2.unitPrice = 1.99;
        food2.calculatePrice();
        System.out.println(food2);

        String [] arr = {"one", "two", "three"};

        Food [] arr2 = {food1, food2, null};
        System.out.println("===========");
        System.out.println(arr2[1]);//Food{name='Chips', quantity=2, unitPrice=1.99, totalPrice=3.98}

        System.out.println(Arrays.toString(arr2));
        //[Food{name='Apple', quantity=0, unitPrice=0.0, totalPrice=0.0}, Food{name='Chips', quantity=2, unitPrice=1.99, totalPrice=3.98}]

        System.out.println("Total: "+ arr2.length + " different foods.");

        System.out.println(arr2[2]);//null

        arr2[2] = new Food("Fish", 4, 2.5);

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        double total = 0.0;
        System.out.println("=======================");
        for(Food each: arr2)
        {
            System.out.println(each);
            total+= each.totalPrice;

        }
        System.out.println(total);

        System.out.println("=====================");
        for(Food each: arr2)
        {
            if(each.totalPrice >= 10)
                System.out.println(each.name);

        }
    }
}
