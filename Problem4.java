//  Define a class Resort with the following description:
// 1.Members are: RNo to store Room Number, Name store customer name,
// Charges to store per day charges, Days to store number of days of stay.
// 2.Member functions:
// 3.Compute() to calculate and return Amount as Days * Charges and if the
// values of Days*Charges is more than 11000 then as 1.02*Days*Charges
//4. Getinfo() A function to enter the content Rno, Name, Charges and Days.
//5. DispInfo() A function to enter the content Rno, Name, Charges, Days and
// Amount by calling function Compute().

import java.util.Scanner;

class Resort {
    int RNo;
    String Name;
    float Charges;
    int Days;

    // to input data
    void Getinfo() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Room No: ");
        RNo = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Charges per day: ");
        Charges = sc.nextFloat();

        System.out.print("Enter Days of stay: ");
        Days = sc.nextInt();
    }

    // to calculate amount
    float Compute() {
        float amount = Days * Charges;

        if (amount > 11000) {
            amount = 1.02f * amount;
        }

        return amount;
    }

    // to display details
    void DispInfo() {
        float amt = Compute();

        System.out.println("Room No: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Charges: " + Charges);
        System.out.println("Days: " + Days);
        System.out.println("Amount: " + amt);
    }

    public static void main(String[] args) {
        Resort r = new Resort();

        r.Getinfo();
        r.DispInfo();
    }
}