package exceptionEx;

public class NullPointerException extends Throwable {
    public static void main(String[] args) {
        String s=null;
        try{
            System.out.println(s.length());
        }
        catch (java.lang.NullPointerException e){
            System.out.println("Exception caught: "+e.getMessage());
        }
    }
}
