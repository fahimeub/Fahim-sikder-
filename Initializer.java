package Test;

public class Initializer {
 static int initialvaliue;
    static {
        initialvaliue = 1050;
        System.out.println("static block:" + initialvaliue);
    }
    public static void main(String[] args){
        System.out.println("Before_instance: " + Initializer.initialvaliue);
        Initializer obj = new Initializer();
        System.out.println("After_Instance: " + Initializer.initialvaliue);
    }   
}
