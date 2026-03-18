// Define a class CARRENTAL with the following details:
// 1.Class Members are: CarId of int type, CarType of string type and Rent of
// float type.
// 2.Define GetCar() method which accepts CarId and CarType.
// 3. GetRent() method which return rent of the car on the basis of car type, i.e.
// Small Car = 1000, Van = 800, SUV = 2500
// 4. ShowCar() method which allow user to view the contents of cars i.e. id, type
// and rent.

class CARRENTAL {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type;
    }

    float GetRent() {
        if (CarType.equals("Small Car")) {
            Rent = 1000;
        } else if (CarType.equals("Van")) {
            Rent = 800;
        } else if (CarType.equals("SUV")) {
            Rent = 2500;
        }
        return Rent;
    }

    void ShowCar() {
        System.out.println("Car Id: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        CARRENTAL c1 = new CARRENTAL();

        c1.GetCar(101, "Small Car");
        c1.GetRent();
        c1.ShowCar();
    }
}
