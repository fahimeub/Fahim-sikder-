package Super;

public class ParentCO {
    ParentCO(String name) {
        System.out.println("Parent Constructor: " + name);
    }
}

class Child extends ParentCO {
    Child(String name) {
        super(name);  // Call parent constructor with argument
        System.out.println("Child Constructor: " + name);
    }

    public static void main(String[] args) {
        Child c = new Child("SUII"+ "");
    }
}
