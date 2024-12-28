final class Finalsuper {
        int rectangle(){
            int l=10,b=5;
            int n=l*b;
            System.out.println("The area of the rectangle is: "+n);
            return n;
        }    
}

class Final2 {
    float circle(){
        float r= 5.2f;
        float area= 3.14f*r*r;
        System.out.println("The area of the circle is: "+area);
        return area;
    } 

}

class FinalEg{
    public static void main(String[] args) {
        Finalsuper f1 = new Finalsuper();
        f1.rectangle();

        Final2 f2 = new Final2();
        f2.circle();
    }
}
