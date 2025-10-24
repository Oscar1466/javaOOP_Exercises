
class Rectangle {
    double width;
    double height;

  
    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }

    void displayDetails() {
        System.out.println("Rectangle Width: " + width);
        System.out.println("Rectangle Height: " + height);
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}


   public class RectangleMain {
    public static void main(String[] args) {
       
        Rectangle rectangle = new Rectangle(5, 10);

        rectangle.displayDetails();
    }
}
