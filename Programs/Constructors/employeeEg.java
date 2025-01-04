package Constructors;
class employee {
        int eid;
        String ename;
        int sal;

        employee(){      //default constructor

        }

        employee(int eid, String ename, int sal){    //parameterised constructor
            this.eid=eid;
            this.ename=ename;
            this.sal=sal;
        }

        employee(employee tmp){    //copy constructor
            eid=tmp.eid;
            ename=tmp.ename;
            sal=tmp.sal;
        }

        void display(){
            System.out.println("The eid is "+eid);
            System.out.println("The eid is "+ename);
            System.out.println("The eid is "+sal);
        }

        
}

class employeeEg{
    public static void main(String[] args) {
        employee e = new employee();
        e.display();
    }
}
