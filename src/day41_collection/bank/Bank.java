package day41_collection.bank;

public class Bank {
    double balance;

    //withdraw
    public void withdraw(double amountToTakeOut) {
        if(amountToTakeOut>balance)
        {
            throw new NotEnoughBalanceException("Balance only has: " + balance);
        }
        balance -= amountToTakeOut;
    }

    //login
    public void login(String username, String password) throws InvalidCredentialException{
        if(!username.equals("loopcamp")){
            System.out.println("Not valid username");
            throw new InvalidCredentialException("Invalid username");
        }

        if(!password.equals("Test123@")){
            System.out.println("Not valid password");
            throw new InvalidCredentialException("Not valid password");

        }
    }
}
