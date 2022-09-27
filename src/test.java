public class test {
    public static void main(String[] args) {
        int i = 1;
        int j = 1;
        int a = i++ + i++;//第n个i++的值为 1*(n-1)+i（初始值）
        int b = ++j + ++j;//第n个++i的值为 1*n+i（初始值）
        System.out.println(a);
        System.out.println(b);
    }
}
