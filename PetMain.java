
 class Pet {
    String name;
    String species;
    int age;

     public Pet(String name, String species, int age) {
        this.name = name;
        this.species = species;
        this.age = age;
    }

     void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years");
    }

    
     int ageInHumanYears() {
        return age;
    }
}


 class Dog extends Pet {
    String favoriteToy;

     public Dog(String name, int age, String favoriteToy) {
        super(name, "Dog", age);
        this.favoriteToy = favoriteToy;
    }

     @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Favorite Toy: " + favoriteToy);
        System.out.println("Age in Human Years: " + ageInHumanYears());
    }

     @Override
     int ageInHumanYears() {
        return age * 7; 
    }
}


class Bird extends Pet {

    double wingspan;

     public Bird(String name, int age, double wingspan) {
        super(name, "Bird", age);
        this.wingspan = wingspan;
    }

     @Override
     void displayDetails() {
        super.displayDetails();
        System.out.println("Wingspan: " + wingspan + " m");
        System.out.println("Age in Human Years: " + ageInHumanYears());
    }

     @Override
     int ageInHumanYears() {
        return age * 5; 
    }
}

 public class PetMain {
     public static void main(String[] args) {
        Dog dog = new Dog("Buddy", 3, "Ball");
        Bird bird = new Bird("Tweety", 2, 0.5);

        System.out.println("Dog Details:");
        dog.displayDetails();

        System.out.println("\nBird Details:");
        bird.displayDetails();
    }
}
