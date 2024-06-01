package day33_b_encapsulation.bank_account;

public class BankAccount {
    // By making these private, I am restricting DIRECT access to them.
    // Or, I hide them from direct access
    private String accountNumber;
    private String routingNumber;

    public String getRoutingNumber() {
        return routingNumber;
    }

    public void setRoutingNumber(String routingNumber) {
        if (routingNumber.length() == 9) {
            this.routingNumber = routingNumber;
        } else {
            System.out.println("Not correct digits count");
        }

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.length() >= 12 && accountNumber.length() <= 17){
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Not correct digits count");
        }
    }
}
