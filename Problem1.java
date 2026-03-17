// Create a class called Person with name (String) and age (int) attributes. Implement
// a constructor to set these attributes upon object creation. Create two Person objects,
// set their details, and print them.
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Problem1 {
    public static void main(String[] args) {
        // Creating two Person objects
        Person person1 = new Person("Rahul", 21);
        Person person2 = new Person("Sneha", 19);

        // Printing their details
        person1.displayDetails();
        person2.displayDetails();
    }
}