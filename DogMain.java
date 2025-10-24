public class DogMain {
   
    private String name;
    private String breed;
    
  
    public DogMain(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setBreed(String breed) {
        this.breed = breed;
    }   
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Breed: " + breed);
    }
    public static void main(String[] args) {
       
        DogMain dog1 = new DogMain("Buddy", "Golden Retriever");
        DogMain dog2 = new DogMain("Max", "German Shepherd");
        
      
        System.out.println("Original Dog Information:");
        System.out.println("\nDog 1:");
        dog1.displayInfo();
        System.out.println("\nDog 2:");
        dog2.displayInfo();
        
      
        dog1.setName("Rocky");
        dog1.setBreed("bulldog");
        dog2.setName("Charlie");
        dog2.setBreed("Husky");
      
        System.out.println("\nUpdated Dog Information:");
        System.out.println("\nDog 1:");
        dog1.displayInfo();
        System.out.println("\nDog 2:");
        dog2.displayInfo();
    }
}
