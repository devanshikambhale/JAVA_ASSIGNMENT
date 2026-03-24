// A library wants to store details of multiple books.
// Question:
// Create a class Book with attributes:
//  title
//  author
//  price
// Create an array of Book objects and display the details of all books.

import java.util.Scanner;

class Book
{
    String title;
    String author;
    double price;

    Book(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void display()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("- - - - - - - - - ");
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many books? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        Book books[] = new Book[n];

        for(int i = 0; i < n; i++)
        {
            System.out.println("Enter details for book " + (i+1));

            System.out.print("Title: ");
            String title = sc.nextLine();

            System.out.print("Author: ");
            String author = sc.nextLine();

            System.out.print("Price: ");
            double price = sc.nextDouble();
            sc.nextLine(); // consume newline

            books[i] = new Book(title, author, price);
        }

        System.out.println("\nBook Details:");
        for(int i = 0; i < n; i++)
        {
            books[i].display();
        }
    }
}