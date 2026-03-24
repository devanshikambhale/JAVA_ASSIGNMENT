//  A ride booking application supports different types of rides. Each ride calculates
// fare differently.
// Question:
// Create an abstract class Ride with:
//  distance
//  abstract method calculateFare()
// Create subclasses:
//  BikeRide → fare = ₹5 per km
//  AutoRide → fare = ₹8 per km
//  CarRide → fare = ₹12 per km
// Store different rides in a Ride array and calculate fares using runtime
// polymorphism.

abstract class Ride
{
    int distance;

    Ride(int distance)
    {
        this.distance = distance;
    }

    abstract void calculateFare();
}

class BikeRide extends Ride
{
    BikeRide(int distance)
    {
        super(distance);
    }

    void calculateFare()
    {
        int fare = distance * 5;
        System.out.println("Bike ride fare = ₹" + fare);
    }
}

class AutoRide extends Ride
{
    AutoRide(int distance)
    {
        super(distance);
    }

    void calculateFare()
    {
        int fare = distance * 8;
        System.out.println("Auto ride fare = ₹" + fare);
    }
}

class CarRide extends Ride
{
    CarRide(int distance)
    {
        super(distance);
    }

    void calculateFare()
    {
        int fare = distance * 12;
        System.out.println("Car ride fare = ₹" + fare);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        // array of Ride references
        Ride rides[] = new Ride[3];
        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(15);
        rides[2] = new CarRide(20);

        // Runtime polymorphism
        for(int i = 0; i < rides.length; i++)
        {
            rides[i].calculateFare();
        }
    }
}