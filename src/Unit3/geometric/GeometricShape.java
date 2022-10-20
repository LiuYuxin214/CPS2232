package Unit3.geometric;// interface for geometric shapes of all kinds

public interface GeometricShape<T extends GeometricShape> {
    void describe();

    T supersized();
}

