package zadanieTrzecie;

public class Account {
    private String owner;
    private int balance;
    private String accountNumber;
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public void transfer(int amount) throws NotEnoughMoneyException{
        if(amount > balance){
            throw new NotEnoughMoneyException("Niewystarczajace srodki na koncie");
        }
        balance -= amount;
    }
    public String getOwner() {
        return owner;
    }
    public int getBalance() {
        return balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public void setOwner(String owner) {
        this.owner = owner;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
}
