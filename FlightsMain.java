import java.util.ArrayList;

class TravelReservationSystem {
    private ArrayList<String> flights;
    private ArrayList<String> hotels;

     public TravelReservationSystem() {
        flights = new ArrayList<>();
        hotels = new ArrayList<>();
    }

     public void searchFlights() {
        System.out.println("\nAvailable Flights:");
        System.out.println("Flight A - Manila to Cebu");
        System.out.println("Flight B - Manila to Davao");
    }

     public void searchHotels() {
        System.out.println("\nAvailable Hotels:");
        System.out.println("Hotel One");
        System.out.println("Hotel Two");
    }

     public void bookFlight(String flight) {
        flights.add(flight);
        System.out.println("Booked Flight: " + flight);
    }

     public void bookHotel(String hotel) {
        hotels.add(hotel);
        System.out.println("Booked Hotel: " + hotel);
    }

     public void cancelFlight(String flight) {
        if (flights.remove(flight)) {
            System.out.println("Canceled Flight: " + flight);
        } else {
            System.out.println("Flight not found!");
        }
    }

     public void cancelHotel(String hotel) {
        if (hotels.remove(hotel)) {
            System.out.println("Canceled Hotel: " + hotel);
        } else {
            System.out.println("Hotel not found!");
        }
    }
 
     public void showReservations() {
        System.out.println("\nYour Reservations:");
        System.out.println("Flights: " + flights);
        System.out.println("Hotels: " + hotels);
    }
}

public class FlightsMain {
    public static void main(String[] args) {
        TravelReservationSystem system = new TravelReservationSystem();

        system.searchFlights();
        system.searchHotels();

        system.bookFlight("Flight A");
        system.bookHotel("Hotel One");

        system.showReservations();

        system.cancelHotel("Hotel One");
        system.showReservations();
    }
}