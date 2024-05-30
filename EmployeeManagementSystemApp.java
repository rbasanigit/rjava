import java.util.ArrayList;
import java.util.Scanner;

class Employee {
    private int empID;
    private String name;
    private String designation;
    private double salary;

    public Employee(int empID, String name, String designation, double salary) {
        this.empID = empID;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

    // Getters and setters

    public int getEmpID() {
        return empID;
    }

    public String getName() {
        return name;
    }

    public String getDesignation() {
        return designation;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class EmployeeManagementSystem {
    private ArrayList<Employee> employeeList;

    public EmployeeManagementSystem() {
        employeeList = new ArrayList<>();
    }

    public void createEmployee(int empID, String name, String designation, double salary) {
        Employee employee = new Employee(empID, name, designation, salary);
        employeeList.add(employee);
        System.out.println("Employee added successfully.");
    }

    public void updateEmployeeData(int empID, double newSalary) {
        for (Employee employee : employeeList) {
            if (employee.getEmpID() == empID) {
                employee.setSalary(newSalary);
                System.out.println("Employee data updated successfully.");
                return;
            }
        }
        System.out.println("Employee not found with EmpID: " + empID);
    }

    public void searchEmployee(int empID) {
        for (Employee employee : employeeList) {
            if (employee.getEmpID() == empID) {
                System.out.println("Employee found:");
                displayEmployeeDetails(employee);
                return;
            }
        }
        System.out.println("Employee not found with EmpID: " + empID);
    }

    public void listEmployeesByDesignation(String designation) {
        System.out.println("Employees with Designation " + designation + ":");
        for (Employee employee : employeeList) {
            if (employee.getDesignation().equalsIgnoreCase(designation)) {
                displayEmployeeDetails(employee);
            }
        }
    }

    public void displayEmployeePaySlip(int empID) {
        for (Employee employee : employeeList) {
            if (employee.getEmpID() == empID) {
                System.out.println("Pay Slip for Employee " + employee.getName() + ":");
                System.out.println("EmpID: " + employee.getEmpID());
                System.out.println("Salary: $" + employee.getSalary());
                return;
            }
        }
        System.out.println("Employee not found with EmpID: " + empID);
    }

    private void displayEmployeeDetails(Employee employee) {
        System.out.println("EmpID: " + employee.getEmpID());
        System.out.println("Name: " + employee.getName());
        System.out.println("Designation: " + employee.getDesignation());
        System.out.println("Salary: $" + employee.getSalary());
        System.out.println("-----------------------------");
    }
}

public class EmployeeManagementSystemApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        while (true) {
            System.out.println("Employee Management System");
            System.out.println("1. Create Employee");
            System.out.println("2. Update Employee Data");
            System.out.println("3. Search Employee by EmpID");
            System.out.println("4. List Employees by Designation");
            System.out.println("5. Display Employee Pay Slip");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter EmpID: ");
                    int empID = scanner.nextInt();
                    scanner.nextLine(); // Consume the newline character
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter Designation: ");
                    String designation = scanner.nextLine();
                    System.out.print("Enter Salary: ");
                    double salary = scanner.nextDouble();
                    ems.createEmployee(empID, name, designation, salary);
                    break;

                case 2:
                    System.out.print("Enter EmpID to update data: ");
                    int updateEmpID = scanner.nextInt();
                    System.out.print("Enter new Salary: ");
                    double newSalary = scanner.nextDouble();
                    ems.updateEmployeeData(updateEmpID, newSalary);
                    break;

                case 3:
                    System.out.print("Enter EmpID to search: ");
                    int searchEmpID = scanner.nextInt();
                    ems.searchEmployee(searchEmpID);
                    break;

                case 4:
                    System.out.print("Enter Designation to list employees: ");
                    String listDesignation = scanner.nextLine();
                    ems.listEmployeesByDesignation(listDesignation);
                    break;

                case 5:
                    System.out.print("Enter EmpID to display pay slip: ");
                    int paySlipEmpID = scanner.nextInt();
                    ems.displayEmployeePaySlip(paySlipEmpID);
                    break;

                case 0:
                    System.out.println("Exiting Employee Management System. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

