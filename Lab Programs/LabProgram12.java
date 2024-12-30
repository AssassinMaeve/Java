/* 

Define an abstract class Number{int num} with following methods then
define a class Value which extends Number. Use the same in the main
class.

• Number:
▪ Number(int n) - parameterized constructor
▪ boolean isPerfect(); – method to check whether it is perfect
number or not.
▪ abstract boolean isPrime(); - method to check whether it is
prime number or not.

• Value:
▪ A relevant constructor to instantiate super class.
▪ boolean isArmstrong(); - method to check whether it is armstrong
number or not.

*/

import java.util.Scanner;
abstract class Number {
    int num;
    
    Number ( int num ){
        this.num = num;
    }

    abstract boolean isPerfect();
    abstract boolean isPrime();
    
}

class Value extends Number{

    Value(int num){
        super(num);
    }

    boolean isPerfect(){
        int sum = 0;
        for(int i = 1 ; i <= num / 2 ; i++ ){
            if( num % i == 0){
                sum += i;
            }
        }
        return sum == num;
    }

    boolean isPrime(){
        if( num == 1){
            return false;
        }
        for (int i = 2 ; i <= Math.sqrt(num) ; i++){
            if( num % i == 0){
                return false;
            }
        }
        return true;
    }

    boolean isArmstrong(){
        int temp = num;
        int total = 0;
        while (temp != 0) {
            int digit = temp % 10;
            total +=  digit * digit * digit;
            temp /= 10;
        }
        if ( total == num){
            return true;
        } else {
            return false;
        }
    }
}

public class LabProgram12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.println("Enter a number");
        int n = sc.nextInt();

        Value val = new Value(n);
        System.out.println("The Number is "+n);
        System.out.println("Is Prime? "+val.isPrime());
        System.out.println("Is Perfect? "+val.isPerfect());
        System.out.println("Is Armstrong? "+val.isArmstrong());
        sc.close();
    }
}
