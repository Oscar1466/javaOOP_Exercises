class Building {
    String address;
    int numberOfFloors;
    double totalArea;

     public Building(String address, int numberOfFloors, double totalArea) {
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.totalArea = totalArea;
    }

     void displayDetails() {
        System.out.println("Address: " + address);
        System.out.println("Floors: " + numberOfFloors);
        System.out.println("Total Area: " + totalArea + " sq.m.");
    }
}

 class ResidentialBuilding extends Building {
    int apartments;
    double rent;

      public ResidentialBuilding(String address, int floors, double area, int apartments, double rent) {
        super(address, floors, area);
        this.apartments = apartments;
        this.rent = rent;
    }

     double totalRent() {
        return apartments * rent;
    }

    @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Apartments: " + apartments);
        System.out.println("Rent per Apartment: ₱" + rent);
        System.out.println("Total Rent: ₱" + totalRent());
    }
}


 class CommercialBuilding extends Building {
    double officeSpace;
    double rentPerSqM;

     public CommercialBuilding(String address, int floors, double area, double officeSpace, double rentPerSqM) {
        super(address, floors, area);
        this.officeSpace = officeSpace;
        this.rentPerSqM = rentPerSqM;
    }

     double totalRent() {
        return officeSpace * rentPerSqM;
    }

    @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Office Space: " + officeSpace + " sq.m.");
        System.out.println("Rent per sq.m.: ₱" + rentPerSqM);
        System.out.println("Total Rent: ₱" + totalRent());
    }
}

 public class BuildingMain {
     public static void main(String[] args) {
        ResidentialBuilding res = new ResidentialBuilding("123 Elm St.", 5, 2000, 10, 15000);
        CommercialBuilding com = new CommercialBuilding("456 Oak Ave.", 8, 5000, 3000, 500);

        System.out.println("Residential Building:");
        res.displayDetails();

        System.out.println("\nCommercial Building:");
        com.displayDetails();
    }
}
