package day41_collection.recap;

import java.util.ArrayList;

public class RecapTry {

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("java");
        list.add("api");
        list.add("ci/cd");



        try{
            System.out.println(list.get(4));//indexoutofbound
            String str = null;

            str = str.toLowerCase();
        }
        catch(IndexOutOfBoundsException e){
            System.out.println(e.getMessage());//Index 4 out of bounds for length 3
            e.printStackTrace();
            System.out.println("Index out of bounds exception");
        }
        catch(NullPointerException e){
            e.printStackTrace();
        }

        System.out.println(list);

        try{
            Thread.sleep(300);
        }catch(InterruptedException | IllegalArgumentException e){
            System.out.println("Number is wrong");
        }
        finally{
            System.out.println("This will always run ");
        }
        //Single "or" | --> forces the compiler to check both, not just the first matching
        System.out.println("FINAL");

    }

}
