import java.util.ArrayList;

class SchoolMAin {

   
    private ArrayList<String> students;
    private ArrayList<String> teachers;
    private ArrayList<String> classes;

    
    public SchoolMAin() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
        classes = new ArrayList<>();
    }

    public void addStudent(String student) {
        students.add(student);
        System.out.println(student + " added to students.");
    }

    public void removeStudent(String student) {
        students.remove(student);
        System.out.println(student + " removed from students.");
    }

    public void addTeacher(String teacher) {
        teachers.add(teacher);
        System.out.println(teacher + " added to teachers.");
    }

    public void removeTeacher(String teacher) {
        teachers.remove(teacher);
        System.out.println(teacher + " removed from teachers.");
    }

    public void createClass(String className) {
        classes.add(className);
        System.out.println(className + " class created.");
    }

    public void displayInfo() {
        System.out.println("\n--- School Info ---");
        System.out.println("Students: " + students);
        System.out.println("Teachers: " + teachers);
        System.out.println("Classes: " + classes);
    }

    public static void main(String[] args) {
        SchoolMAin school = new SchoolMAin();

     school.addStudent("Mathilda");
     school.addStudent("Lapu");

     school.addTeacher("Mr. Harith");
     school.addTeacher("Ms. Johnson");

     school.createClass("Math");
     school.createClass("Science");
        
     school.removeStudent("Bob");
     school.removeTeacher("Ms. Johnson");

        school.displayInfo();
    }
}
