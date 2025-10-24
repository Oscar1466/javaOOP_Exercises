class AirplaneMain {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private boolean delayed;

  
     public AirplaneMain(String flightNumber, String destination, String departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.delayed = false; 
    }

     public void setDelay(boolean delayStatus) {
        delayed = delayStatus;
    }

     public void checkFlightStatus() {
        System.out.println("\nFlight Number: " + flightNumber);
        System.out.println("Destination: " + destination);
        System.out.println("Departure Time: " + departureTime);

        if (delayed) {
            System.out.println("Status: ❌ Delayed");
        } else {
            System.out.println("Status: ✅ On Time");
        }
    }
}


  class Main {
    public static void main(String[] args) {
        AirplaneMain plane1 = new AirplaneMain("PR 143", "Brazil", "08:45 AM");

        plane1.checkFlightStatus(); 

        plane1.setDelay(true);
        plane1.checkFlightStatus(); 
    }
}