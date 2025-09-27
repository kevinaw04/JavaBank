public class Savings extends Account{
    private int numberOfDeposits = 0;
    public Savings(double s){
        super(s);
    }
    @Override
    public double withdraw(double withdrawSavings){
        double newBalance = super.withdraw(withdrawSavings);
        if(newBalance < 500){
            System.out.println("Charging a fee of $10 because you are below $500");
            newBalance -= 10;
        }
        return newBalance;
    }
    @Override
    public double deposit(double depositSavings){
        double newBalance = super.deposit(depositSavings);
        numberOfDeposits++;
        System.out.println("This is deposit " + numberOfDeposits + " to this account");
        if(numberOfDeposits > 5){
            System.out.println("Charging a fee of $10");
            newBalance -= 10;
        }
        return newBalance;
    }
    public double addInterest(){
        double currentBalance = getAccountBalance();
        double interestAccumulated = currentBalance * 0.015;
        double newBalance = super.deposit(interestAccumulated);
        System.out.println("Customer has earned $" + interestAccumulated + " in interest");
        return  newBalance;
    }

    @Override
    public String toString(){
        return "Savings " + super.toString();
    }
}
