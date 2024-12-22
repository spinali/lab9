package zadanieTrzecie;

import lombok.Data;

@Data
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
}
