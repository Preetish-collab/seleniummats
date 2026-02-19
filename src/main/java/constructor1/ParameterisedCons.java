package constructor1;

public class ParameterisedCons {

        int id;
        String name;
        char section;
    ParameterisedCons(int id,String name,char section){
        this.id=id;
        this.name=name;
        this.section=section;

    }
    void display(){
        System.out.println(id+" "+name+" "+section);
    }
}
