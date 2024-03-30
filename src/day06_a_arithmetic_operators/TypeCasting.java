package day06_a_arithmetic_operators;

public class TypeCasting {

    public static void main(String [] args)
    {
        byte b = 40;
        int i = b; //value is automatically converted into int because byte is smaller than int


       // int i2 = 100;
        //byte b2 = i2; //the container size allocated to int variables in memory is larger than byte container, therefore byte cannot store in container even though the actual value of 100 can be stored in byte,like example below

        byte b3 = 100;

        //there is a way to do the above by type casting
        int i2 = 100;
        byte b2 = (byte)i2; //if value in i2 is larger than what a byte can hold - there WILL be DATA LOSS
        System.out.println(i2);
        System.out.println(b2);



    }
}
