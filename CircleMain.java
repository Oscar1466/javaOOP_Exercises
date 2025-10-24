class CircleMain {
    private double radius;

  
    public CircleMain(double radius) {
        this.radius = radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

  
    public double getRadius() {
        return radius;
    }

    
    public double getArea() {
        return Math.PI * radius * radius;
    }

   
    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        CircleMain circle = new CircleMain(5.0);

        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.getArea());
        System.out.println("Circumference: " + circle.getCircumference());

        circle.setRadius(7.5);
        System.out.println("\nUpdated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.getArea());
        System.out.println("Updated Circumference: " + circle.getCircumference());
    }
}
