import java.util.Scanner;
class employee {
            int eid[];
            String name[];
            int sal[];

            employee(int size){
                eid= new int[size];
                name= new String[size];
                sal= new int[size];

            }

            void accept(){
                Scanner sc= new Scanner(System.in);
                System.out.println("Enter the employee details:");
                     for (int i = 0; i < eid.length; i++) {
                         System.out.print("Enter Employee ID: ");
                            eid[i] = sc.nextInt();
                            sc.nextLine();  // Consume the newline
                        System.out.print("Enter Name: ");
                            name[i] = sc.nextLine();
                         System.out.print("Enter Salary: ");
                             sal[i] = sc.nextInt();
        }
      sc.close();
    }


            void display(){
                System.out.println("The employee details are: ");
                    for(int i=0;i<eid.length;i++){ 
                System.out.println("The Eid is: "+eid[i]);
                System.out.println("The name is: "+name[i]);
                System.out.println("The sal is: "+sal[i]);
            }
        }

            int calSal(int n){
                return(n*12);
            }
             
}

class employeeEg {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of employees: ");
        int numofemployee =sc.nextInt();
        
        employee e = new employee(numofemployee);
        e.accept();
        e.display();

        for(int i=0;i<e.eid.length;i++){
            int annual= e.calSal(e.sal[i]);
            System.out.println("The Annual is: "+annual+" of "+e.name[i]);
            System.out.println("----------------------");

        }
        sc.close();
    }

    
}
