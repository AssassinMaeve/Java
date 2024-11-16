package Constructors;
public class Employee {
    int eid;
    int sal;
    String name;

    Employee(){
        eid=123;
        sal=12000;
        name="Kumar";
    }

    Employee(int i, int s,String n){
        eid=i;
        sal=s;
        name=n;
    }

    Employee(Employee tmp1){
        eid=tmp1.eid;
        sal=tmp1.sal;
        name=tmp1.name;
    }

    void display(){
        System.out.println("The employee id is: "+eid);
        System.out.println("The employee name is: "+name);
        System.out.println("The employee sal is: "+sal);
        System.out.println("---------------------------------");
    }

    double calSal(){
        double da = 0.3*sal ;
        double grosssal= sal + da;
        return grosssal;
        
    }
}

class EmployeeEgg{
    public static void main(String []args){
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee(123,12000,"Kumar");
        e2.display();
        Employee e3 = new Employee(e2);
        e3.display();

        double grosssal= e1.calSal();
        System.out.println("The employee grosssal is: "+grosssal);
    }
}
