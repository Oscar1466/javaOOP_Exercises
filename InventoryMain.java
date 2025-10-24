import java.util.ArrayList;

class InventoryMain {
    
    private ArrayList<String> products;
    private int lowStockLimit;

  
    public InventoryMain(int lowStockLimit) {
        products = new ArrayList<>();
        this.lowStockLimit = lowStockLimit;
    }

    public void addProduct(String product) {
        products.add(product);
        System.out.println(product + " has been added to inventory.");
    }

    public void removeProduct(String product) {
        if (products.remove(product)) {
            System.out.println(product + " has been removed from inventory.");
        } else {
            System.out.println(product + " was not found.");
        }
    }

    public void checkLowInventory() {
        if (products.size() <= lowStockLimit) {
            System.out.println("⚠ Warning: Inventory is low! (" + products.size() + " items left)");
        } else {
            System.out.println("✅ Inventory is sufficient! (" + products.size() + " items available)");
        }
    }

    public void showInventory() {
        System.out.println("📦 Current Inventory: " + products);
    }

    public static void main(String[] args) {
        InventoryMain myStore = new InventoryMain(2); 
        myStore.addProduct("Milk");
        myStore.addProduct("Bread");
        myStore.addProduct("Eggs");
        
         System.out.print("");

        myStore.showInventory();
        myStore.checkLowInventory();

        System.out.print("");

        myStore.removeProduct("Eggs");
        myStore.removeProduct("Milk");

        System.out.print("");

        myStore.showInventory();
        myStore.checkLowInventory();
    }
}
