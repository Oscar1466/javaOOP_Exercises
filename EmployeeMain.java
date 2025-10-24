 
class Employee {
    String name;
    String jobTitle;
    double salary;

    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

   
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Job Title: " + jobTitle);
        System.out.println("Salary: ₱" + salary);
    }

   
    double calculateAnnualSalary() {
        return salary * 12;
    }

    
    void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Salary updated to: ₱" + salary);
    }
}


public class EmployeeMain{
    public static void main(String[] args) {
        Employee emp = new Employee("Maria Santos", "Software Developer", 50000);

        emp.displayInfo();
        System.out.println("Annual Salary: ₱" + emp.calculateAnnualSalary());

        
        emp.updateSalary(55000);
        System.out.println("Updated Annual Salary: ₱" + emp.calculateAnnualSalary());
    }
}

