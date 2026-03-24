// A hospital manages different types of staff.
// Question:
// Create a base class Staff with method work().
// Create subclasses:

//  Doctor
//  Nurse
//  Receptionist
// Override work() to display different responsibilities.

class Staff
{
    void work()
    {
        System.out.println("Staff works in hospital");
    }
}

class Doctor extends Staff
{
    void work()
    {
        System.out.println("Doctor diagnoses and treats patients");
    }
}

class Nurse extends Staff
{
    void work()
    {
        System.out.println("Nurse assists doctors and cares for patients");
    }
}

class Receptionist extends Staff
{
    void work()
    {
        System.out.println("Receptionist manages appointments and reception");
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        // Runtime polymorphism
        s1.work();
        s2.work();
        s3.work();
    }
}