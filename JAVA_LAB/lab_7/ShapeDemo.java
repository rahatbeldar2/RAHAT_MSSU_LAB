// Abstract class representing a general shape
abstract class Shape {
    // Abstract method: subclasses must provide the area calculation
    abstract double calculateArea();

    // Concrete method to display the calculated area
    void display() {
        System.out.println("This shape's area is: " + calculateArea());
    }
}

// Interface that defines the drawing behavior
interface Drawable {
    // Abstract method that implementing classes must define
    void draw();
}

// Circle inherits Shape and implements Drawable
class Circle extends Shape implements Drawable {
    private double radius; // Stores the radius of the circle

    // Constructor to initialize the radius
    Circle(double radius) {
        this.radius = radius;
    }

    // Overriding the abstract method to calculate circle area
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Implementing the draw() method of Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}

// Rectangle inherits Shape and implements Drawable
class Rectangle extends Shape implements Drawable {
    private double length, breadth; // Stores rectangle dimensions

    // Constructor to initialize length and breadth
    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Overriding the abstract method to calculate rectangle area
    @Override
    double calculateArea() {
        return length * breadth;
    }

    // Implementing the draw() method of Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Triangle inherits Shape and implements Drawable
class Triangle extends Shape implements Drawable {
    private double base, height; // Stores triangle dimensions

    // Constructor to initialize base and height
    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    // Overriding the abstract method to calculate triangle area
    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    // Implementing the draw() method of Drawable interface
    @Override
    public void draw() {
        System.out.println("Drawing a Triangle");
    }
}

// Main class to demonstrate abstraction, interfaces, and polymorphism
public class ShapeDemo {
    public static void main(String[] args) {
        // Creating an array of Shape references
        Shape[] shapes = new Shape[3];

        // Creating objects of different shapes
        shapes[0] = new Circle(5);
        shapes[1] = new Rectangle(4, 6);
        shapes[2] = new Triangle(3, 8);

        // Iterating through each shape using an enhanced for loop
        for (Shape s : shapes) {
            // Casting Shape reference to Drawable to call draw()
            ((Drawable) s).draw();

            // Displaying the calculated area of each shape
            s.display();

            // Printing a blank line for better output formatting
            System.out.println();
        }
    }
}