package day32_constructor_chaining;

public class ChainExample {

    public ChainExample()
    {
        System.out.println("First");
    }

    public ChainExample(int i)
    {
        this();
        System.out.println("Second");
    }

    public ChainExample(String str)
    {
        this(4);
        System.out.println("Third");
    }

}
