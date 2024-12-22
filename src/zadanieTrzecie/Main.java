package zadanieTrzecie;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("Riccardo Spinali", 500, "PL1234567890");

        try{
            account.transfer(600);
        }catch (NotEnoughMoneyException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }finally{
            System.out.println("Aktualny stan konta: " + account.getBalance());
        }
    }
}
