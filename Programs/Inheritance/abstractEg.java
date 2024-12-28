abstract class Capcom {
       abstract void capcomre();
}

class re2 extends Capcom{
    void capcomre(){
        System.out.println("RE 2");
    }
}

class re4 extends Capcom{
    void capcomre(){
        System.out.println("RE 4");
    }
}

class abstractEg {
    public static void main(String[] args) {
        Capcom c;
        c = new re2();
        c.capcomre();

        c = new re4();
        c.capcomre();

    }
    
}


