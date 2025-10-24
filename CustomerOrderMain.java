import java.time.LocalDate;

class CustomerOrder{
    String orderID;
    String customer;
    LocalDate orderDate;

    public CustomerOrder(String orderID, String customer, LocalDate orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.orderDate = orderDate;
    }

    void displayOrderDetails() {
        System.out.println("Order ID: " + orderID);
        System.out.println("Customer: " + customer);
        System.out.println("Order Date: " + orderDate);
    }
}


class OnlineOrder extends CustomerOrder {
    String deliveryAddress;
    String trackingNumber;
    String trackingStatus;

    public OnlineOrder(String orderID, String customer, LocalDate orderDate, String deliveryAddress, String trackingNumber) {
        super(orderID, customer, orderDate);
        this.deliveryAddress = deliveryAddress;
        this.trackingNumber = trackingNumber;
        this.trackingStatus = "Processing";
    }

   
    long calculateDeliveryTime() {
        
        if (deliveryAddress.toLowerCase().contains("city")) {
            return 2;
        } else {
            return 5;
        }
    }

   
    void updateTracking(String status) {
        trackingStatus = status;
        System.out.println("Tracking Updated: " + trackingStatus);
    }

    @Override
    void displayOrderDetails() {
        super.displayOrderDetails();
        System.out.println("Delivery Address: " + deliveryAddress);
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Tracking Status: " + trackingStatus);
        System.out.println("Estimated Delivery Time: " + calculateDeliveryTime() + " days");
    }
}


public class CustomerOrderMain {
    public static void main(String[] args) {
        OnlineOrder order = new OnlineOrder("ORD245", "Maricar Zamora", LocalDate.of(2025, 10, 25), "765 City St.", "TRK456");

        System.out.println("Order Details:");
        order.displayOrderDetails();

        System.out.println("\nUpdating Tracking Status...");
        order.updateTracking("Shipped");

        System.out.println("\nUpdated Order Details:");
        order.displayOrderDetails();
    }
}

