public class Checking extends Account{
    public Checking(double c){
        super(c);
    }
    @Override
    public double withdraw(double withdrawalChecking){
        double newBalance = super.withdraw(withdrawalChecking);
        if(newBalance < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            newBalance -= 20;
        }

        return newBalance;

    }
    @Override
    public String toString(){
        return "Checking " + super.toString();
    }


}
