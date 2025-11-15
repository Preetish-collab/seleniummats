package org.project;

public class SplitExample {
    public static void main(String[] args) {
        String s1="jackfruit, is very, good for, health";
        String[]s2=s1.split(",");
        for(int i=0;i<s2.length;i++){
            System.out.println(s2[i]);
        }}
}
