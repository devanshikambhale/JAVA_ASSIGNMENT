// A company wants to track how many employees have been created in the
// system.
// Question:
// Create a class Employee with attributes name and id.
// Use a static variable employeeCount that increases every time a new object is
// created.
// Write a program that:
//  Creates multiple employee objects
//  Displays the total number of employees using a static method

class Employee
{
    String name;
    int id;
    static int employeeCount = 0;  // static variable to track total employees

    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
        employeeCount++;  // increase count whenever a new employee is created
    }

    static void displayEmployeeCount()
    {
        System.out.println("Total employees: " + employeeCount);
    }

    void displayInfo()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Alice", 101);
        Employee e2 = new Employee("Bob", 102);
        Employee e3 = new Employee("Charlie", 103);

        e1.displayInfo();
        e2.displayInfo();
        e3.displayInfo();

        // display total employees
        Employee.displayEmployeeCount();
    }
}