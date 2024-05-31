package day32_constructor_chaining;

public class TestChaining {

    public static void main(String[] args) {

        new ChainExample();//created an object without a reference, prints "First"
        new ChainExample(3);//created an object without a reference, prints "Second"
        new ChainExample("Hello");//created an object without a reference, prints "Third"

    }
}
