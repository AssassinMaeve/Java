class area {


        float area(int r){
            return(3.14f*r*r);
        }

        float area(int l, int b){
            return(l*b);
        }

        double area(double b, double h){
            return(0.5*b*h);
        }
        
        
}
/**
 * areaEg
 */
class areaEg {
    public static void main(String[] args) {
        area a = new area();
        System.out.println("Circle: "+a.area(4));
        System.out.println("Rectangle: "+a.area(9, 9));
        System.out.println("Triangle: "+a.area(9,8));
    }
    
}