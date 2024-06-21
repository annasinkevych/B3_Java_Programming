package day41_collection.bank;

public class NotEnoughBalanceException extends RuntimeException {
    //Any class which is child class of Exception is checked/compile Exception [Except Runtime]
    //Any class which is child class of RuntimeException is unchecked/runtime Exception

    //This is unchecked exception because it extends runtimexception

    public NotEnoughBalanceException(String message) {
        super(message);
    }


}
