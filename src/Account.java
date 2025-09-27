public class Account {
    private int accountNumber;
    private static int nextNumber = 10001;
    private double accountBalance;
    public Account(){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = 0;
    }
    public Account (double balance){
        accountNumber = nextNumber;
        nextNumber++;
        accountBalance = balance;
    }
    public double withdraw(double withdrawal){
        accountBalance -= withdrawal;
        return accountBalance;
    }
    public double deposit(double depositedAmount){
        accountBalance += depositedAmount;
        return accountBalance;
    }
    public double getAccountBalance(){
        return accountBalance;
    }
    public double getAccountNumber(){
        return accountNumber;
    }
    @Override
    public String toString(){
       return "Account #" +accountNumber + ", balance $" +accountBalance;
    }

}
