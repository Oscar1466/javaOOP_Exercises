import java.util.ArrayList;


class Account {
    String accountNumber;
    String accountHolder;
    double balance;

    public Account(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₱" + amount + " into " + accountHolder + "'s account.");
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₱" + amount + " from " + accountHolder + "'s account.");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    void displayAccount() {
        System.out.println(accountHolder + " | Acc No: " + accountNumber + " | Balance: ₱" + balance);
    }
}

class BankMain {
    ArrayList<Account> accounts = new ArrayList<>();

    void addAccount(Account account) {
        accounts.add(account);
        System.out.println("✔ Account added for " + account.accountHolder);
    }

    void removeAccount(String accountNumber) {
        accounts.removeIf(acc -> acc.accountNumber.equals(accountNumber));
        System.out.println("❌ Account removed: " + accountNumber);
    }

    
    void showAccounts() {
        System.out.println("\n🏦 Bank Accounts:");
        for (Account acc : accounts) {
            acc.displayAccount();
        }
    }

    public static void main(String[] args) {
        BankMain bank = new BankMain();

        Account a1 = new Account("1001", "Harith Diaz", 5000);
        Account a2 = new Account("1002", "Maria Labo", 7000);

        bank.addAccount(a1);
        bank.addAccount(a2);
        bank.showAccounts();

        a1.deposit(2000);
        a2.withdraw(3000);
        bank.showAccounts();

        bank.removeAccount("1002");
        bank.showAccounts();
    }
}