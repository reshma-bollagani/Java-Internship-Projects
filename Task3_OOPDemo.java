// Task 3: OOP with Classes
// Author: Reshma Bollagani
// Internship: Alfido Tech Java Developer
// Description: To create a Java program that demonstrates Object-Oriented Programming (OOP) concepts — classes, inheritance, and method overriding.
// Base Class
class Employee {
    String name;
    int empId;
    double salary;

    Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    void displayInfo() {
        System.out.println("-----------------------------------");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }

    void work() {
        System.out.println(name + " is working as a general employee.");
    }
}

// Derived Class 1
class Developer extends Employee {
    String programmingLanguage;

    Developer(String name, int empId, double salary, String programmingLanguage) {
        super(name, empId, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " is developing software using " + programmingLanguage + ".");
    }
}

// Derived Class 2
class Manager extends Employee {
    int teamSize;

    Manager(String name, int empId, double salary, int teamSize) {
        super(name, empId, salary);
        this.teamSize = teamSize;
    }

    @Override
    void work() {
        System.out.println(name + " is managing a team of " + teamSize + " employees.");
    }
}

// Main Class
public class OOPDemo {
    public static void main(String[] args) {
        System.out.println("===================================");
        System.out.println("   OOP with Classes – Alfido Tech");
        System.out.println("===================================");

        Developer dev = new Developer("Reshma", 101, 65000, "Java");
        Manager mgr = new Manager("Rupa", 102, 85000, 5);

        // Display Employee Details
        dev.displayInfo();
        dev.work();

        mgr.displayInfo();
        mgr.work();

        System.out.println("===================================");
        System.out.println("        Program Completed");
        System.out.println("===================================");
    }
}
