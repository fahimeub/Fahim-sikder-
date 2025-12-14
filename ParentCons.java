package Super;

public class ParentCons {
    ParentCons() {
        System.out.println("Parent Constructor");
    }
}

class Child extends ParentCons {
    Child() {
        super();  // Call parent constructor
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child c = new Child();
    }
}
