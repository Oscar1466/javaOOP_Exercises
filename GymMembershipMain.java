
class GymMembership {
    String memberName;
    String membershipType;
    int duration; 
    double monthlyFee;

    public GymMembership(String memberName, String membershipType, int duration, double monthlyFee) {
        this.memberName = memberName;
        this.membershipType = membershipType;
        this.duration = duration;
        this.monthlyFee = monthlyFee;
    }

    // Calculate total fee
    double calculateFee() {
        return monthlyFee * duration;
    }

  
    void checkSpecialOffer() {
        if (duration >= 12) {
            System.out.println("🎉 Eligible for 10% discount!");
        } else {
            System.out.println("No special offers.");
        }
    }

    void displayDetails() {
        System.out.println("Member: " + memberName);
        System.out.println("Type: " + membershipType);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Total Fee: ₱" + calculateFee());
        checkSpecialOffer();
    }
}

// Subclass for premium membership
class PremiumMembership extends GymMembership {
    boolean personalTrainer;
    boolean spaAccess;
    double premiumFee; // monthly fee for premium services

    public PremiumMembership(String memberName, int duration, double monthlyFee, 
    boolean personalTrainer, boolean spaAccess, double premiumFee) {
        super(memberName, "Premium", duration, monthlyFee);
        this.personalTrainer = personalTrainer;
        this.spaAccess = spaAccess;
        this.premiumFee = premiumFee;
    }

    @Override
    double calculateFee() {
        double extra = 0;
        if (personalTrainer) extra += 2000;
        if (spaAccess) extra += 1500;
        return (premiumFee + extra) * duration;
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Personal Trainer: " + (personalTrainer ? "Yes" : "No"));
        System.out.println("Spa Access: " + (spaAccess ? "Yes" : "No"));
        System.out.println("Total Premium Fee: ₱" + calculateFee());
    }
}


public class GymMembershipMain {
    public static void main(String[] args) {
        GymMembership regular = new GymMembership("Juan Dela Cruz", "Standard", 6, 1500);
        PremiumMembership premium = new PremiumMembership("Maria Santos", 12, 2000, true, true, 2000);

        System.out.println("Regular Membership:");
        regular.displayDetails();

        System.out.println("\nPremium Membership:");
        premium.displayDetails();
    }
}
