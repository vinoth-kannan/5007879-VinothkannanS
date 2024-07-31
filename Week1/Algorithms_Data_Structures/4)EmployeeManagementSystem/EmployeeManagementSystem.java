public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more employees ! ");
        }
    }

    public Employee searchEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                return employees[i];
            }
        }
        return null; // Employee not found
    }

    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public void deleteEmployee(int employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId() == employeeId) {
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                return;
            }
        }
        System.out.println("Employee not found. Cannot delete !");
    }

    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(10);

        Employee emp1 = new Employee(1, "Vinoth Kannan", "General Manager", 250000);
        Employee emp2 = new Employee(2, "Vijay Ajith", "Regional Head", 190000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);

        System.out.println("All Employees : ");
        ems.traverseEmployees();

        System.out.println("Search for Employee with ID 1 : ");
        System.out.println(ems.searchEmployee(1));

        ems.deleteEmployee(1);
        System.out.println("All Employees after deletion : ");
        ems.traverseEmployees();
    }
}
