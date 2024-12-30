/*

Create two threads one using Thread class and another using Runnable
interface which shares a common data Number{int} with a parameterized
constructor and a method which increments the value and display. Use
the same to illustrate the concept and effect of Synchronization.

*/

import java.util.Scanner;
class Number{
    int num;
    Number(int n){
    num=n;
    }
        synchronized void print(){
            num=num+10;

            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){

            }

            System.out.println("The value of num is: "+num);
        }
        public int doubleValue() {
            throw new UnsupportedOperationException("Unimplemented method 'doubleValue'");
        }
    }

        class myThread extends Thread{
            Number ref;
                myThread(String name,Number tmp){
                super(name);
                ref=tmp;
                start();
            }

            public void run(){
                System.out.println("Object m1 Thread name: "+getName());
                ref.print();
            }
}

        class ThreadImp implements Runnable{
        Number ref;
        Thread th;
            ThreadImp(String name,Number tmp){
            th=new Thread(this,name);
            ref=tmp;
            th.start();
        }

        public void run(){
            System.out.println("Object m2 Thread name: "+th.getName());
            ref.print();
        }
}


        class LabProgram18{
            public static void main(String[] args) {
            int num;
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter the number: ");
            num=sc.nextInt();

            Number ob=new Number(num);
            @SuppressWarnings("unused")
            myThread m1=new myThread("first",ob);

            @SuppressWarnings("unused")
            ThreadImp m2=new ThreadImp("Second",ob);

        sc.close();
     }
}
