import java.util.ArrayList;

class Restaurant {
    private ArrayList<String> items;
    private ArrayList<Double> prices;
    private ArrayList<Integer> ratings;

    public Restaurant() {
        items = new ArrayList<>();
        prices = new ArrayList<>();
        ratings = new ArrayList<>();
    }

    public void addItem(String item, double price, int rating) {
        items.add(item);
        prices.add(price);
        ratings.add(rating);
        System.out.println(item + " added.");
    }

    public void removeItem(String item) {
        int index = items.indexOf(item);
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
            ratings.remove(index);
            System.out.println(item + " removed.");
        } else {
            System.out.println("Item not found.");
        }
    }

     public double getAverageRating() {
        if (ratings.isEmpty()) return 0.0;

        int total = 0;
        for (int rate : ratings) {
            total += rate;
        }
        return (double) total / ratings.size();
    }

     public void showMenu() {
        System.out.println("\nMenu:");
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i) + " - " + prices.get(i) + " (Rating: " + ratings.get(i) + ")");
        }
    }

     public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();

        restaurant.addItem("Burger", 120.00, 5);
        restaurant.addItem("Spaghetti", 100.00, 4);
        restaurant.addItem("Fries", 60.00, 4);

        restaurant.showMenu();
        System.out.println("Average Rating: " + restaurant.getAverageRating());

        restaurant.removeItem("Fries");
        restaurant.showMenu();
        System.out.println("Average Rating: " + restaurant.getAverageRating());
    }
}