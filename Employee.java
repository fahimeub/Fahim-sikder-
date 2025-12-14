package UseSupper;

public class Employee {
     String name;
    int id;
    Employee(String name,int id){
        this.name=name;
        this.id=id;
    }
}
    class Manager extends Employee{
        String department;
        Manager(String name,int id,String department){
            super(name,id);
            this.department=department;
        }
    public static void main(String[]args){
        Manager m = new Manager("MR",102,"Sales");
        System.out.println(m.name+" "+m.id+" "+m.department);
    }

}
