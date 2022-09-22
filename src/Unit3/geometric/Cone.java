package Unit3.geometric;

public class Cone implements ThreeDShape {
    private final double radius;
    private final double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double volume() {
        return (1.0 / 3.0) * Math.PI * radius * radius * height;
    }

    public void describe() {
        System.out.print("Cone[radius=");
        System.out.print(radius);
        System.out.print(",height=");
        System.out.print(height);
        System.out.println("]");
    }

    public Cone supersized() {
        return new Cone(2.0 * radius, 2.0 * height);
    }
}
