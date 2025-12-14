package StaticMethod;

public class Test {
    static void show() {
        System.out.println("Static method called");
    }

    public static void main(String[] args) {
        Test.show();  // recommended
    }
}
