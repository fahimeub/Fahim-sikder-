package Abstractcode;

public abstract class Animal {
    
   abstract void bark();
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
    public static void main(String[]args){
        Dog d=new Dog();
        d.bark();
    }

}
