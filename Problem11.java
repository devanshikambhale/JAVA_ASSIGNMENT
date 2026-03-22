// A drawing application is being developed where different shapes can be created.
// All shapes share some common properties, so a base class Shape is created with a
// method display() to show general shape information.
// Two specific shapes, Circle and Rectangle, inherit from the Shape class. Each shape
// has its own method to calculate and display its area.
// This demonstrates hierarchical inheritance, where multiple subclasses inherit from a
// single base class.

class Shape
{
    void display()
    {
        System.out.println("This is a shape");
    }
}

class Circle extends Shape
{
    float r;

    Circle(float r)
    {
        this.r = r;
    }

    void area()
    {
        float a = 3.14f * r * r;
        System.out.println("Area of circle = " + a);
    }
}

class Rectangle extends Shape
{
    int l, b;

    Rectangle(int l, int b)
    {
        this.l = l;
        this.b = b;
    }

    void area()
    {
        int a = l * b;
        System.out.println("Area of rectangle = " + a);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        Circle c = new Circle(3);
        c.display();
        c.area();

        Rectangle r = new Rectangle(4, 5);
        r.display();
        r.area();
    }
}