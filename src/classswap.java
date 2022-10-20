public class classswap {

    public static void main(String[] args) {
        circle c1 = new circle(1);
        circle c2 = new circle(2);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
        swap(c1, c2);
        System.out.println(c1.getRadius());
        System.out.println(c2.getRadius());
    }

    public static void swap(circle c1, circle c2) {
        c1 = new circle(3);
    }
}

class circle {
    double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    double getRadius() {
        return radius;
    }

}