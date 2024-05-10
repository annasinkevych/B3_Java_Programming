package day23_multidimensionalArrays;

public class AWS {

    public static void main(String[] args) {
        String app = "etsy";
        String zones =  "us-east1, us-west1, us-west2, us-west3";

        String [] zonesConv = zones.split(", ");

        for (int i = 0; i < zonesConv.length ; i++) {

            System.out.println(zonesConv[i]);
        }

    }
}
