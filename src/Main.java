public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        Shape rectangle = new Rectangle();
        Shape triangle = new Triangle();

        shape.calculateArea(5,10);
        rectangle.calculateArea(5,10);
        triangle.calculateArea(5,10);
    }
}