package Super;

public class ParentMe {
    void show() {
        System.out.println("Parent method");
    }
}

class Child extends ParentMe {
    void show() {
        System.out.println("Child method");
    }

    void display() {
        show();        // Child method
       super.show(); // Parent method
    }
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}

