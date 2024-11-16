package Encapulation;
import java.time.LocalDate;

 class Encap {


    // cannot access the variables directly
    private long id;
    private String name;
    private int age;
    private LocalDate DOB;
    private String email;

    /* Encap(int id, String name, int age, LocalDate DOB, String email){
        this.id=id;
        this.name=name;
        this.DOB=DOB;
        this.email=email;
    }
     */

    // Setting up the Getter
    public Long getid(){
        return id;
    }

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public LocalDate getDOB(){
        return DOB;
    }

    public String getemail(){
        return email;
    }

    public void setLong(Long id){
        this.id=id;
    }

    public void setage(int age){
        this.age=age;
    }

    public void setname(String name){
        this.name=name;
    }

    public void setDOB(LocalDate DOB){
        this.DOB=DOB;
    }

    public void setemail(String email){
        this.email=email;
    }
}

class InnerEncap {
    public static void main(String[] args) {
        Encap e = new Encap();
        e.setname("Maeve");

        LocalDate dob = LocalDate.of(2001,9,11);
        e.setDOB(dob);
        e.setage(23);
        e.setemail("email@gmail.com");

        System.out.println("Name: "+e.getname()+" | Age: "+e.getage()+" | email: "+e.getemail()+" | DOB: "+e.getDOB());
    }
    
}