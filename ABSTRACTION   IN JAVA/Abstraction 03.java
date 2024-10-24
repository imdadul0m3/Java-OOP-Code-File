
 abstract class Shape02 {
    protected int x;
    protected int y;


    public Shape02(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public void move(int dx, int dy) {
        x += dx;
        y += dy;
    }

    public static void printInfo(Shape02 shape02) {
        System.out.println("Area: " + shape02.getArea());
        System.out.println("Perimeter: " + shape02.getPerimeter());
        System.out.println("Position: (" + shape02.x + ", " + shape02.y + ")");
    }
}



 class Circle02 extends Shape02 {
    protected double radius;

    public Circle02(int x, int y, double radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}



 class Rectangle02 extends Shape02 {
    protected double width;
    protected double height;

    public Rectangle02(int x, int y, double width, double height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

     public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}




class Main {
    public static void main(String[] args) {

        // Create a circle and a rectangle

        Circle02 circle02 = new Circle02(5, 5, 10);
        Rectangle02 rectangle = new Rectangle02(10, 10, 20, 30);

        // Move the circle and rectangle

        circle02.move(2, 2);
        rectangle.move(4, 10);

        // Print the properties of the circle and rectangle

        System.out.println("Circle:");

        Shape02.printInfo(circle02);

        System.out.println();

        System.out.println("Rectangle:");
        Shape02.printInfo(rectangle);
    }
}




