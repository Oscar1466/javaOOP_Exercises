import java.time.LocalDate;


class Reservation {
    String reservationID;
    String customerName;
    LocalDate date;

    public Reservation(String reservationID, String customerName, LocalDate date) {
        this.reservationID = reservationID;
        this.customerName = customerName;
        this.date = date;
    }

    void displayReservation() {
        System.out.println("Reservation ID: " + reservationID);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Date: " + date);
    }
}


class ResortReservation extends Reservation {
    int roomNumber;
    boolean checkedIn;

     public ResortReservation(String reservationID, String customerName, LocalDate date, int roomNumber) {
        super(reservationID, customerName, date);
        this.roomNumber = roomNumber;
        this.checkedIn = false;
    }

     void checkIn() {
        checkedIn = true;
        System.out.println("Customer checked in to room " + roomNumber);
    }

     void modifyRoom(int newRoom) {
        roomNumber = newRoom;
        System.out.println("Room changed to " + roomNumber);
    }

     @Override
     void displayReservation() {
        super.displayReservation();
        System.out.println("Room Number: " + roomNumber);
        System.out.println("Checked In: " + checkedIn);
    }
}


 class RailwayReservation extends Reservation {
    String seatNumber;
    boolean confirmed;

     public RailwayReservation(String reservationID, String customerName, LocalDate date, String seatNumber) {
        super(reservationID, customerName, date);
        this.seatNumber = seatNumber;
        this.confirmed = false;
    }

     void confirmReservation() {
        confirmed = true;
        System.out.println("Reservation confirmed for seat " + seatNumber);
    }

     void modifySeat(String newSeat) {
        seatNumber = newSeat;
        System.out.println("Seat changed to " + seatNumber);
    }

     @Override
     void displayReservation() {
        super.displayReservation();
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Confirmed: " + confirmed);
    }
}
 public class ReservationMain {
     public static void main(String[] args) {
        ResortReservation resort = new ResortReservation("R001", "Juan Dela Cruz", LocalDate.of(2025, 12, 5), 101);
        RailwayReservation railway = new RailwayReservation("T001", "Maria Santos", LocalDate.of(2025, 12, 5), "A12");

        System.out.println("Resort Reservation:");
        resort.displayReservation();
        resort.checkIn();
        resort.modifyRoom(102);

        System.out.println("\nRailway Reservation:");
        railway.displayReservation();
        railway.confirmReservation();
        railway.modifySeat("B15");
    }
}
