
abstract class Shape01 {
    int x, y;
    public Shape01(int x, int y) {
        this.x = x;
        this.y = y;
    }
    abstract double getArea();
}

class Circle01 extends Shape01 {
    int radius;
    public Circle01(int x, int y, int radius) {
        super(x, y);
        this.radius = radius;
    }
    @Override
    double getArea() {
        return Math.PI * radius * radius;
    }
}

  class Rectangle01 extends Shape01 {
    int width, height;
    public Rectangle01(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }
    //abstract  double pi();
    int adddd(int aa, int bb){
        return aa + bb;
    }
    @Override
    double getArea() {
        return width * height;
    }
}

public class Abstraction01 {
    public static void main(String[] args) {

        Shape01 circle = new Circle01(2,5,5);
        Shape01 rectangle = new Rectangle01(4, 4, 10, 20);
        System.out.println("Circle area: " + circle.getArea());
        System.out.println("Rectangle area: " + rectangle.getArea());
    }

}





