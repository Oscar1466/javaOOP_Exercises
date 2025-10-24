import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


 class Event {
    String eventName;
    LocalDate date;
    String location;

     public Event(String eventName, LocalDate date, String location) {
        this.eventName = eventName;
        this.date = date;
        this.location = location;
    }

     void displayDetails() {
        System.out.println("Event: " + eventName);
        System.out.println("Date: " + date);
        System.out.println("Location: " + location);
    }

     boolean isConflict(Event other) {
        return this.date.equals(other.date) && this.location.equalsIgnoreCase(other.location);
    }
}


 class Seminar extends Event {
    int numberOfSpeakers;

     public Seminar(String eventName, LocalDate date, String location, int numberOfSpeakers) {
        super(eventName, date, location);
        this.numberOfSpeakers = numberOfSpeakers;
    }

     @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Speakers: " + numberOfSpeakers);
    }
}


 class MusicalPerformance extends Event {
    List<String> performers;

     public MusicalPerformance(String eventName, LocalDate date, String location, List<String> performers) {
        super(eventName, date, location);
        this.performers = performers;
    }

     @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Performers: " + String.join(", ", performers));
    }
}

 public class EventMain {
     public static void main(String[] args) {
        Seminar seminar = new Seminar("Tech Seminar", LocalDate.of(2025, 11, 10), "Auditorium A", 5);
        List<String> performers = new ArrayList<>();
        performers.add("Band A");
        performers.add("Singer B");
        MusicalPerformance concert = new MusicalPerformance("Evening Concert", LocalDate.of(2025, 11, 10), "Auditorium A", performers);

        System.out.println("Seminar Details:");
        seminar.displayDetails();

        System.out.println("\nConcert Details:");
        concert.displayDetails();

        System.out.println("\nChecking for schedule conflict...");
        if (seminar.isConflict(concert)) {
            System.out.println("⚠️ Schedule Conflict Detected!");
        } else {
            System.out.println("✅ No Conflict.");
        }
    }
}
