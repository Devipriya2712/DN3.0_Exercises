package Datastructure;
public class EmployeeManagementSystem {
    private Employee[] employees;
    private int size; // Number of employees currently in the array
    private static final int INITIAL_CAPACITY = 10;

    public EmployeeManagementSystem() {
        employees = new Employee[INITIAL_CAPACITY];
        size = 0;
    }

    // Method to add an employee
    public void addEmployee(Employee employee) {
        if (size == employees.length) {
            resizeArray();
        }
        employees[size++] = employee;
    }

    // Method to search for an employee by ID
    public Employee searchEmployeeById(int employeeId) {
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null;
    }

    // Method to traverse and print all employees
    public void traverseEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }

    // Method to delete an employee by ID
    public boolean deleteEmployeeById(int employeeId) {
        int indexToDelete = -1;
        for (int i = 0; i < size; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                indexToDelete = i;
                break;
            }
        }
        if (indexToDelete == -1) {
            return false; // Employee not found
        }

        // Shift elements to remove the gap
        for (int i = indexToDelete; i < size - 1; i++) {
            employees[i] = employees[i + 1];
        }
        employees[size - 1] = null; // Clear the last element
        size--;
        return true;
    }

    // Resize the array when needed
    private void resizeArray() {
        int newCapacity = employees.length * 2;
        Employee[] newArray = new Employee[newCapacity];
        System.arraycopy(employees, 0, newArray, 0, size);
        employees = newArray;
    }
}

