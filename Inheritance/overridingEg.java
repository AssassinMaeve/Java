class overriding {
    int cal(){
        int n=5;
        int m=5;
        int x=n+m;
        return x;
    }
}

class overriding1 extends overriding{
    int cal(){
       int n=10;
       int m=10;
        int x=n+m;
        return x;
    }
}

class overridingEg{
    public static void main(String[] args) {
        overriding1 o1 = new overriding1();

        System.out.println("Overriding - "+o1.cal());
        System.out.println("Overriding 1 - "+o1.cal());
    }
}
