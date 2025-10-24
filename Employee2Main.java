import java.time.LocalDate;
import java.time.Period;


class Employee2 {
    String name;
    double salary;
    LocalDate hireDate;

    public Employee2(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₱" + salary);
        System.out.println("Hire Date: " + hireDate);
    }

    int calculateYearsOfService() {
        LocalDate today = LocalDate.now();
        return Period.between(hireDate, today).getYears();
    }
}


public class Employee2Main {
    public static void main(String[] args) {
        Employee2 emp = new Employee2("Melisa Guzman", 50000, LocalDate.of(2018, 5, 20));

        emp.displayInfo();
        System.out.println("Years of Service: " + emp.calculateYearsOfService());
    }
}


