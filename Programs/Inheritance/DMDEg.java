 class DMD {
    void Display(){
        System.out.println("GTX 1050");
    }
}

class DMD1 extends DMD{
    void Display(){
        System.out.println("RTX 4060");
    }
}

class DMD2 extends DMD{
    void Display(){
        System.out.println("RTX 4070");
    }
}

class DMDEg{
    public static void main(String[] args) {
        DMD d;
        d=new DMD();
        d.Display();

        d=new DMD1();
        d.Display();

        d=new DMD2();
        d.Display();
    }
}
