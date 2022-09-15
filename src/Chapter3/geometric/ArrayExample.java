// You should add statements to this code as needed, so that
// the code compiles correctly, and when it is run, it raises
// a java.lang.ArrayStoreException when adding the cone to geoshapes.
// (Adding the circle should be OK.)

package Chapter3.geometric;

class ArrayExample {
    public static void main(String[] args) {
        GeometricShape[] geoshapes = new Circle[2];
        geoshapes[0] = new Circle(1.0);
        geoshapes[1] = new Cone(2.0, 3.0);
    }
}