// A company wants to evaluate employee performance.
// Create an abstract class Employee with:
//  attributes: name, id
//  abstract method calculateBonus()
// Create subclasses:

//  Manager → bonus is 20% of salary
//  Developer → bonus is 10% of salary plus project incentive
// Demonstrate runtime polymorphism by storing different employee objects in an
// Employee reference and calling calculateBonus().

abstract class Employee
{
    String name;
    int id;

    Employee(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    abstract void calculateBonus();
}

class Manager extends Employee
{
    double salary;

    Manager(String name, int id, double salary)
    {
        super(name, id);
        this.salary = salary;
    }

    void calculateBonus()
    {
        double bonus = 0.2 * salary;
        System.out.println("Manager " + name + " Bonus = " + bonus);
    }
}

class Developer extends Employee
{
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive)
    {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    void calculateBonus()
    {
        double bonus = 0.1 * salary + projectIncentive;
        System.out.println("Developer " + name + " Bonus = " + bonus);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Employee e1 = new Manager("Alice", 101, 50000);
        Employee e2 = new Developer("Bob", 102, 40000, 5000);

        // Runtime polymorphism
        e1.calculateBonus();
        e2.calculateBonus();
    }
}