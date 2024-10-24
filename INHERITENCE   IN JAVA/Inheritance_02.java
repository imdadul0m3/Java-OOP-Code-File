
class ShapeA{
    public String name;

    public ShapeA(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

class Circle3 extends ShapeA{
    public Circle3() {
        super("Circle");
    }
}

class Square extends ShapeA{
    public Square() {
        super("Square");
    }
}

class DrawingBoard{
    public void draw(ShapeA shape) {
        System.out.println("Drawing a shape : "+ shape.getName());
    }
}

class Run{
    public static void main(String[] args){
        DrawingBoard drbd = new DrawingBoard();
        Circle3 circle = new Circle3();
        Square square = new Square();
        drbd.draw(circle);
        drbd.draw(square);
    }
}




