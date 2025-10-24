
class Course {
    String courseName;
    String instructor;
    int credits;

    public Course(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
    }
}


class OnlineCourse extends Course {
    String platform;
    int duration; 

    public OnlineCourse(String courseName, String instructor, int credits, String platform, int duration) {
        super(courseName, instructor, credits);
        this.platform = platform;
        this.duration = duration;
    }

    
    void checkCertificateEligibility() {
        if (duration >= 20) {
            System.out.println("Eligible for Certificate");
        } else {
            System.out.println("Not Eligible for Certificate");
        }
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Duration: " + duration + " hours");
    }
}

   class CourseMain {
    public static void main(String[] args) {
        OnlineCourse course = new OnlineCourse("Java Programming", "Mr. Dingca", 3, "Udemy", 25);

        course.displayDetails();
        course.checkCertificateEligibility();
    }
}


