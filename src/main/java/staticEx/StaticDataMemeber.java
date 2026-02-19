package staticEx;

public class StaticDataMemeber {
    int id;
    String name;
    static String school="IVM";
//    static void change() { //creating static method
//        school = "PIET";
//    }
       StaticDataMemeber(int id,String name ){
        this.id=id;
        this.name=name;


    }
    void display(){
        System.out.println(id+" "+name+" "+school);
    }
}
