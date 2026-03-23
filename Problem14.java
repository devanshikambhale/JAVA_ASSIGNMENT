// / Create a base class Person with method role().
// Create subclasses:
//  Employee
//  Manager (extends Employee)
// Override role() in each class and demonstrate multilevel inheritance with runtime
// polymorphism.

class Person
{
    void role()
    {
        System.out.println("I am a person");
    }
}

class Employee extends Person
{
    void role()
    {
        System.out.println("I am an employee");
    }
}

class Manager extends Employee
{
    void role()
    {
        System.out.println("I am a manager");
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Person p1 = new Person();
        Person p2 = new Employee();
        Person p3 = new Manager();

        // Runtime polymorphism
        p1.role();  // calls Person's role
        p2.role();  // calls Employee's role
        p3.role();  // calls Manager's role
    }
}