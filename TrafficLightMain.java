class TrafficLight {
    String color;
    int duration; 

    
     TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }
     void changeColor(String newColor) {
        color = newColor;
        System.out.println("The light changed to: " + color);
    }
     boolean isRed() {
        return color.equalsIgnoreCase("Red");
    }
     boolean isGreen() {
        return color.equalsIgnoreCase("Green");
    }
     void showStatus() {
        System.out.println("Current Light: " + color + " | Duration: " + duration + " seconds");
    }
}

class TrafficLightMain {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);

        light.showStatus();

        light.changeColor("Green");

        if (light.isGreen()) {
            System.out.println("You can go!");
        } else if (light.isRed()) {
            System.out.println("Stop, please!");
        }
    }
}
