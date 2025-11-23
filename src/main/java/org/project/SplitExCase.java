package org.project;

public class SplitExCase {
    public static void main(String[] args) {

        String str="my-name-is-preetish";
        String[]split=str.split("-");
        for(String s:split){
            String upper=s.substring(0,1).toUpperCase();
            String lower=s.substring(1).toLowerCase();
            String concat=upper+lower;
            System.out.println(" "+concat);
        }
    }
}
