package staticEx;

public class StaticDataMember2 {
    public static void main(String[] args) {
       // StaticDataMemeber.change();//calling static method without creating object
    StaticDataMemeber s1=new StaticDataMemeber(12,"Alice");
    StaticDataMemeber s2=new StaticDataMemeber(13,"Bob");
        s1.display();
        s2.display();
}}
