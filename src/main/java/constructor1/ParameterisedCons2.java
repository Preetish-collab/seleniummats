package constructor1;

public class ParameterisedCons2 {
    public static void main(String[] args) {
        ParameterisedCons p1=new ParameterisedCons(101,"Alice",'A');
        ParameterisedCons p2=new ParameterisedCons(102,"Bob",'B');
        p1.display();
        p2.display();
    }
}
