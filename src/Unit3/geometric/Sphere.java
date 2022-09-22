package Unit3.geometric;

public class Sphere implements ThreeDShape {
    private final double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double volume() {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public void describe() {
        System.out.print("Sphere[radius=");
        System.out.print(radius);
        System.out.println("]");
    }

    public GeometricShape supersized() {
        return new Sphere(radius * 2.0);
    }

}
