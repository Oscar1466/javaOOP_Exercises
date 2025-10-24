
class Customer {
    String name;
    String email;
    double totalExpenditure;

    public Customer(String name, String email) {
        this.name = name;
        this.email = email;
        this.totalExpenditure = 0.0;
    }
 
    void addPurchase(double amount) {
        totalExpenditure += amount;
        System.out.println("Added purchase: ₱" + amount);
    }
   
    double getTotalExpenditure() {
        return totalExpenditure;
    }
  
    void displayInfo() {
        System.out.println("Customer Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Total Expenditure: ₱" + totalExpenditure);
    }
}


class LoyalCustomer extends Customer {
    double discountRate;

    public LoyalCustomer(String name, String email, double discountRate) {
        super(name, email);
        this.discountRate = discountRate;
    }

   
    void applyDiscount(double amount) {
        double discount = amount * (discountRate / 100);
        double finalAmount = amount - discount;
        addPurchase(finalAmount);
        System.out.println("Discount Applied: ₱" + discount);
        System.out.println("Final Amount After Discount: ₱" + finalAmount);
    }
}


 class CustomerMain {
    public static void main(String[] args) {
        LoyalCustomer customer = new LoyalCustomer("Coco Martin", "Coco@martin.com", 10.0);

        customer.displayInfo();
        System.out.println("\nMaking Purchases...\n");

        customer.addPurchase(500);
        customer.applyDiscount(1000); 

        System.out.println("\nUpdated Details:");
        customer.displayInfo();
    }
}
