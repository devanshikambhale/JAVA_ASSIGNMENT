// A company wants to clearly assign constructor parameters to object variables.
// Question:
// Create a class Employee with variables name and salary.
// Use this keyword inside the constructor to initialize object variables.
// Display employee details.

class Employee
{
    String name;
    double salary;

    // Constructor with parameters
    Employee(String name, double salary)
    {
        this.name = name;     // 'this' assigns constructor parameter to object variable
        this.salary = salary;
    }

    void display()
    {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: ₹" + salary);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Employee e1 = new Employee("Alice", 50000);
        Employee e2 = new Employee("Bob", 60000);

        e1.display();
        System.out.println();
        e2.display();
    }
}