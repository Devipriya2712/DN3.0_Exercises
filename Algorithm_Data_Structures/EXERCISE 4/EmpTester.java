package Datastructure;
public class EmpTester {

    public static void main(String[] args) {
        // Create an instance of EmployeeManagementSystem
        EmployeeManagementSystem system = new EmployeeManagementSystem();

        // Add some employees
        system.addEmployee(new Employee(1, " Smith", "Developer", 70000));
        system.addEmployee(new Employee(2, "Johnson", "Manager", 85000));
        system.addEmployee(new Employee(3, "Sam", "Analyst", 60000));
        
       

        // Traverse and print all employees
        System.out.println("All Employees:");
        system.traverseEmployees();

        // Search for an employee by ID
        int searchId = 3;
        Employee searchedEmployee = system.searchEmployeeById(searchId);
        if (searchedEmployee != null) {
            System.out.println("\nFound Employee with ID " + searchId + ":");
            System.out.println(searchedEmployee);
        } else {
            System.out.println("\nEmployee with ID " + searchId + " not found.");
        }

        // Delete an employee by ID
        int deleteId = 2;
        boolean isDeleted = system.deleteEmployeeById(deleteId);
        if (isDeleted) {
            System.out.println("\nEmployee with ID " + deleteId + " has been deleted.");
        } else {
            System.out.println("\nEmployee with ID " + deleteId + " could not be deleted.");
        }

        // Traverse and print all employees after deletion
        System.out.println("\nEmployees After Deletion:");
        system.traverseEmployees();
    }
}

