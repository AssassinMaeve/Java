package Constructors;
//Define a class Person - name, age, weight with methods to accept, display and return the BMI = Kg /
//m2 in order to display the appropriate message in main class. criteria - < 18.5 underweight, 18.5 -
//24.9 Normal, 25 - 29.9 Overweight and >= 30 Obese.
import java.util.Scanner;
class person{
        String name;
        int age;
        int weight;
        int height;

        void accept(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your name: ");
            name=sc.next();

            System.out.println("Enter your age: ");
            age=sc.nextInt();

            System.out.println("Enter your weight: ");
            weight=sc.nextInt();
            
            System.out.println("Enter your height: ");
            height=sc.nextInt();
            
            sc.close();
        }


        int bmi(){
            return weight/(height*height);
        }


        void display(){
            System.out.println("Name: "+name);
            System.out.println("Age: "+age);
            System.out.println("Weight: "+weight);
            System.out.println("Height: "+height);
            System.out.println("BMI: "+cat());
        }

        String cat(){
            int cat = bmi();
            if(cat < 18.5){
                return "Underweight";
            }else if(cat > 18.5 && cat<=24.9) {
                return "Normal";
            } else if (cat > 25 && cat<=29.9) {
                return "overweight";
            } else {
                return"obses";
            }
        }
    
}

class personEg{
    public static void main(String[] args) {
        person p = new person();
        p.accept();
        p.display();

    }
}

