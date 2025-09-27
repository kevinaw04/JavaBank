import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Checking checkingAccount = new Checking(0.0);

        Savings savingsAccount = new Savings(500.0);

        System.out.println(checkingAccount);
        System.out.println(savingsAccount);

        while(true){
            System.out.println("[Banking System]");
            System.out.println("\n1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings");
            System.out.println("8. Quit");
            int choice = sc.nextInt();

            switch (choice){
                case 1:
                System.out.print("How much would you like to withdraw from Checking? $");
                double withdrawChecking = sc.nextDouble();
                checkingAccount.withdraw(withdrawChecking);
                System.out.println("Current balance of Checking is $" + checkingAccount.getAccountBalance());
                break;
                case 2:
                    System.out.print("How much would you like to withdraw from Savings? $");
                    double withdrawSavings = sc.nextDouble();
                    savingsAccount.withdraw(withdrawSavings);
                    System.out.println("Current balance of Savings is $" +savingsAccount.getAccountBalance());
                    break;
                case 3:
                    System.out.print("How much would you like to deposit to Checking? $");
                    double depositChecking = sc.nextDouble();
                    checkingAccount.deposit(depositChecking);
                    System.out.println("Current balance of Checking is $" + checkingAccount.getAccountBalance());
                    break;
                case 4:
                    System.out.print("How much would you like to deposit to Saving? $");
                    double depositSavings = sc.nextDouble();
                    savingsAccount.deposit(depositSavings);
                    System.out.println("Current balance of Savings is $" +savingsAccount.getAccountBalance());
                    break;
                case 5:
                    System.out.println(checkingAccount);
                    break;
                case 6:
                    System.out.println(savingsAccount);
                    break;
                case 7:
                    savingsAccount.addInterest();
                    System.out.println("Current balance of Savings is $" +savingsAccount.getAccountBalance());
                    break;
                case 8:
                    System.out.println("Shutting off...");
                    return;
                default:
                    System.out.println("Invalid choice.");
                    break;




            }
        }


    }

}