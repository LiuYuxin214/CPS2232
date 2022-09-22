package Unit3;

public class Test<T> {
    T obj;

    Test(T obj) {
        this.obj = obj;
    }

    public T getObject() {
        return this.obj;
    }

    public static void main(String[] args) {
        //instance of Integer type
        Test<Integer> iObj = new Test<Integer>(15);
        System.out.println(iObj.getObject());
        //instance of String type
        Test<String> sObj = new Test<String>("Hello");
        System.out.println(sObj.getObject());
    }
}
