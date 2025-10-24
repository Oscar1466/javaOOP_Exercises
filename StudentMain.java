import java.util.ArrayList;

class Student {
    String name;
    String grade;
    ArrayList<String> courses = new ArrayList<>();

   
     Student(String name, String grade) {
        this.name = name;
        this.grade = grade;
    }

     void addCourse(String course) {
        courses.add(course);
        System.out.println(course + " has been added to " + name + "'s courses.");
    }

     void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println(course + " has been removed from " + name + "'s courses.");
        } else {
            System.out.println(course + " is not found in " + name + "'s courses.");
        }
    }

     void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Courses: " + courses);
    }
}

    class StudentMain {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Grade 10");

        student.addCourse("P.E");
        student.addCourse("Science");
        student.addCourse("Filipino");

        student.displayInfo();
        student.removeCourse("Science");
        student.displayInfo();
    }
}

