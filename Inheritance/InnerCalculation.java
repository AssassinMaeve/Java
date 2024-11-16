class Calculation {
    int z;

    int Addition(int x, int y){
        z = x + y;
        System.out.println("The addition of the two numbers are: "+z);
        return z;
    }

    int Subtration(int x, int y){
        z = x - y;
        System.out.println("The subtration of the two numbers are: "+z);
        return z;
    }
}

public class InnerCalculation extends Calculation {
    public static void main(String[] args) {

        Calculation c = new Calculation();
        System.out.println("The addition of the 2 number is: "+c.Addition(2, 2));
        System.out.println("The Subtraction of the 2 number is: "+c.Subtration(2, 2));
    }
}
