package org.project;

public class StringBuilderEx {
    public static void main(String[] args) {
        String s="jackfruit";
        StringBuffer sb=new StringBuffer(s);
        sb.replace(1,3,"banana");
        System.out.println(sb);
        sb.delete(1,7);
        System.out.println(sb);

    }
}
