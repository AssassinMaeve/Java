class timepractice {
    int hrs;
    int mins;
    int secs;

    timepractice(){
        hrs=2;
        mins=10;
        secs=10;
    }


    
    timepractice(timepractice tmp){
        hrs=tmp.hrs;
        mins=tmp.mins;
        secs=tmp.secs;
    }


    timepractice(int h, int m, int s){
        hrs=h;
        mins=m;
        secs=s;
    }


    void addtime(timepractice t1, timepractice t2){
        hrs=t1.hrs+t2.hrs;
        mins=t1.mins+t2.mins;
        secs=t1.secs+t2.secs;
        if(secs>=60){
            mins=mins+secs/60;
            secs=secs%60;
        }if(mins>=60){
            hrs=hrs+mins/60;
            mins=mins%60;
        }
    }

    timepractice addtime(timepractice t){
        timepractice tmp = new timepractice();

        tmp.hrs=hrs+t.hrs;
        tmp.mins=mins+t.mins;
        tmp.secs=secs+t.secs;

        if(tmp.secs>=60){
            tmp.mins=tmp.mins+tmp.secs/60;
            tmp.secs=tmp.secs%10;
        }if(tmp.mins>=60){
            tmp.hrs=tmp.hrs+tmp.mins/60;
            tmp.mins=tmp.mins%60;
        }
        return(tmp);

    }

    void display(){
        System.out.println("Time: "+hrs+" Hour "+mins+" Mins "+secs+" Secs ");
    }
}

/**
 * Innertimepractice
 */
class Innertimepractice {
    public static void main(String[] args) {
        timepractice t1 = new timepractice();
        t1.display();

        timepractice t2 = new timepractice(t1);
        t2.display();

        timepractice t3 = new timepractice(4,25,30);
        t3.display();

        timepractice t4 = new timepractice();
        t4.addtime(t1,t2);
        t4.display();

        timepractice t5;
        t5=t3.addtime(t2);
        t5.display();
    }
    
}
