
class BankAccount {
    
    private int accountNumber;
    private String accountHolderName;
    private double balance;

   public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
    }

    
     public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: P" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }

   
     public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: P" + amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            System.out.println("Amount must be positive.");
        }
    }

   
     public void checkBalance() {
        System.out.println("Current balance: P" + balance);
    }

   
     public int getAccountNumber() {
        return accountNumber;
    }

     public String getAccountHolderName() {
         return accountHolderName;
    }

     public double getBalance() {
        return balance;
    }
}


 class SavingsAccount extends BankAccount{
    private double interestRate; 

   
     public SavingsAccount(int accountNumber, String accountHolderName, double initialBalance, double interestRate) {
        super(accountNumber, accountHolderName, initialBalance);
        this.interestRate = interestRate;
    }

    
     public void applyInterest() {
        double interest = (getBalance() * interestRate) / 100;
        deposit(interest);
        System.out.println("Interest applied: P" + interest);
    }

    
     public double getInterestRate() {
        return interestRate;
    }
}


 public class BankAccountMain {
     public static void main(String[] args) {

        BankAccount account = new BankAccount(12345, "Lapu", 1000);
        account.deposit(500.0);
        account.withdraw(200.0);
        account.checkBalance();  
        SavingsAccount savings = new SavingsAccount(67890, "Jane Smith", 2000.0, 5.0);
        savings.deposit(1000.0); 
        savings.withdraw(500.0);
        savings.applyInterest(); 
        savings.checkBalance();  
    }
}

