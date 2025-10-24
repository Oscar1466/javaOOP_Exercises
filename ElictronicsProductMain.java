



 class ElectronicsProductMain {
    private String productID;
    private String name;
    private double price;
    private double finalPrice;

    public ElectronicsProductMain(String productID, String name, double price) {
        this.productID = productID;
        this.name = name;
        this.price = price;
        this.finalPrice = price;
    }

    public void applyDiscount(double percent) {
        if (percent > 0 && percent < 100) {
            finalPrice = price - (price * percent / 100);
            System.out.println("Discount applied: " + percent + "%");
        } else {
            System.out.println("Invalid discount percent!");
        }
    }

     public double getFinalPrice() {
        return finalPrice;
    }

     public void displayInfo() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}


  class WashingMachine extends ElectronicsProductMain {
    private int warrantyPeriod;

   
     public WashingMachine(String productID, String name, double price, int warrantyPeriod) {
        super(productID, name, price);
        this.warrantyPeriod = warrantyPeriod;
    }


     public void extendWarranty(int extraMonths) {
        if (extraMonths > 0) {
            warrantyPeriod += extraMonths;
            System.out.println("Warranty extended by " + extraMonths + " months.");
        } else {
            System.out.println("Invalid extension period!");
        }
    }

    
     @Override
     public void displayInfo() {
        super.displayInfo();
        System.out.println("Warranty Period: " + warrantyPeriod + " months");
    }
}


   class elictronicsproductMain {
     public static void main(String[] args) {

        ElectronicsProductMain product = new ElectronicsProductMain("E001", "Sharp", 500.0);
        product.displayInfo();
        product.applyDiscount(10); 
        System.out.println("Final Price: $" + product.getFinalPrice());
        System.out.println();

      
        WashingMachine washer = new WashingMachine("W001", "LG Washing Machine", 800.0, 24);
        washer.displayInfo();
        washer.applyDiscount(15); 
        washer.extendWarranty(12);
        System.out.println("Final Price: $" + washer.getFinalPrice());
    }
}
