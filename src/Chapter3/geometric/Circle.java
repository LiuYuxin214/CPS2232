package Chapter3.geometric;

import Chapter3.geometric.TwoDShape;

public class Circle implements TwoDShape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double circumference() {
        return Math.PI * 2.0 * radius;
    }

    public void describe() {
        System.out.print("Circle[radius=");
        System.out.print(radius);
        System.out.println("]");
    }

    public GeometricShape supersized() {
        return new Circle(radius * 2.0);
    }

}
