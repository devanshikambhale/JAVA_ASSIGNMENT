// Create an abstract class Shape with an abstract method calculate_area() and a
// concrete method display_info(). Create concrete subclasses
// like Circle and Rectangle that must implement their own specific logic
// for calculate_area(). Try to instantiate an object of the Shape class directly and
// observe the compilation error. Use the subclass objects to call both abstract and
// concrete methods.

abstract class Shape
{
    abstract void calculate_area();

    void display_info()
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

    void calculate_area()
    {
        float area = 3.14f * r * r;
        System.out.println("Area of circle = " + area);
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

    void calculate_area()
    {
        int area = l * b;
        System.out.println("Area of rectangle = " + area);
    }
}

class mainclass
{
    public static void main(String args[])
    {
        // Shape s = new Shape();  // this will give error (cannot instantiate abstract class)

        Circle c = new Circle(3);
        c.display_info();
        c.calculate_area();

        Rectangle r = new Rectangle(4, 5);
        r.display_info();
        r.calculate_area();
    }
}