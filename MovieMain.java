import java.util.ArrayList;

class MovieMain {
    private String title;
    private String director;
    private ArrayList<String> actors;
    private ArrayList<String> reviews;

   
     public MovieMain(String title, String director) {
        this.title = title;
        this.director = director;
        this.actors = new ArrayList<>();
        this.reviews = new ArrayList<>();
    }

     public void addActor(String actor) {
        actors.add(actor);
        System.out.println(actor + " has been added to the cast.");
    }

     public void addReview(String review) {
        reviews.add(review);
        System.out.println("Review added: \"" + review + "\"");
    }

    
     public void showDetails() {
        System.out.println("\n🎬 Movie Details 🎬");
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Actors: " + actors);
        System.out.println("Reviews: " + reviews);
    }

    public static void main(String[] args) {
        MovieMain movie = new MovieMain("Inception", "Christopher Nolan");

        movie.addActor("Coco Martin");
        movie.addActor("Daniel Padilla");
        movie.addActor("James Reid");

        movie.addReview("A very mind-blowing movie!");
        movie.addReview("One of the best sci-fi films ever made!");

        movie.showDetails();
    }
}
