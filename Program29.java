// Define a class Student with attributes id and name.

//  Override toString() method.
//  Create object of class.
//  Display object details using toString().
class Student {
    int id;
    String name;

    // Constructor
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Overriding toString() method
    @Override
    public String toString() {
        return "Student ID: " + id + ", Name: " + name;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object of Student class
        Student s1 = new Student(101, "Rahul");

        // Displaying object details using toString()
        System.out.println(s1.toString());
    }
}
