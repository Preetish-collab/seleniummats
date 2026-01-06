package org.project;

public class AccessSpecifierEx {
    private AccessSpecifierEx(){}
    //Private access  modifier accessible within the same class
    public static void main(String[] args) {
        AccessSpecifierEx obj=new AccessSpecifierEx();
        System.out.println(obj.data);
        obj.msg();

        //OP-20
        //Hello Java


        
    }
    private int data=20;
    private void msg(){
        System.out.println("Hello Java");
     
              
        
        
    }
}
