package Unit3.geometric;

public class Rectangle implements TwoDShape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2.0 * (width + height);
    }

    public void describe() {
        System.out.print("Rectangle[width=");
        System.out.print(width);
        System.out.print(",height=");
        System.out.print(height);
        System.out.println("]");
    }

    public GeometricShape supersized() {
        return new Rectangle(width * 2.0, height * 2.0);
    }

}
