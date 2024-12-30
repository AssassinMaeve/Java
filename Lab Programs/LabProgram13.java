/*

Define an interface Convert with following methods then define a class
Value {int } with relevant constructor which implements the above
interface. Illustrate the use of same in the main class.
• Convert:
▪ int toBin(); int toOctal(); String toHexadecimal();

*/

import java.util.Scanner;
interface Convert {

    int toBin();
    int toOctal();
    String toHexadecimal();

}

class Value implements Convert {

    int num;
    Value(int num){
        this.num = num;
    }

    
    public int toBin(){
        int binary = 0;
        int place = 1;
        int temp = num;

        while (temp != 0) {
            int remainder = temp % 2;
            binary += remainder * place;
            place *= 10;
            temp /= 2;
        }
        return binary;
    }

    
    public int toOctal(){
        int Octa = 0;
        int place = 1;
        int temp = num;

        while (temp != 0) {
            int remainder = temp % 8;
            Octa += remainder * place;
            place *= 10;
            temp /= 8;
        }
        return Octa;
    }

    
    public String toHexadecimal(){
        StringBuffer sb = new StringBuffer();
        int temp = num;

        while (temp != 0) {
            int remainder = temp % 16;
            if( remainder < 10){
                sb.append((char) ('0' + remainder));
            } else {
                sb.append((char) ('A' + (remainder - 10)));
            }
            temp /= 16;
        }
        return sb.reverse().toString();
    }
}

class LabProgram13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Number");
        int n = sc.nextInt();

        Value val = new Value(n);
        System.out.println("The Binary Number is: "+val.toBin());
        System.out.println("The Octadecimal Number is: "+val.toOctal());
        System.out.println("The Hexadecimal Number is: "+val.toHexadecimal());
        sc.close();
    }
}
