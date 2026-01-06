package org.project;

//https://codingbat.com/prob/p
//Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
public class JavaInterviewPractice {
//    public static String helloName(String name) {
//        return "Hello " + name + "!";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(helloName("Bob"));    // Hello Bob!
//        System.out.println(helloName("Alice"));  // Hello Alice!
//        System.out.println(helloName("X"));      // Hello X!
//    }

    //Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.
//public static String makeOutWord(String out, String word) {
//    // assume out.length() == 4
//    return out.substring(0, 2) + word + out.substring(2, 4);
//}
//
//    public static void main(String[] args) {
//        System.out.println(makeOutWord("<<>>", "Yay"));     // <<Yay>>
//        System.out.println(makeOutWord("<<>>", "WooHoo"));  // <<WooHoo>>
//        System.out.println(makeOutWord("[[]]", "word"));    // [[word]]
//    }

//    public static String firstHalf(String str) {
//        return str.substring(0, str.length() / 2);
//    }
//
//    public static void main(String[] args) {
//        System.out.println(firstHalf("WooHoo"));      // Woo
//        System.out.println(firstHalf("HelloThere"));  // Hello
//        System.out.println(firstHalf("abcdef"));      // abc
//    }

//    public static String seeColor(String str) {
//        if (str == null || str.isEmpty()) return "";
//        if (str.startsWith("red")) return "red";
//        if (str.startsWith("blue")) return "blue";
//        return "";
//    }
//
//    public static void main(String[] args) {
//        System.out.println(seeColor("redxx"));      // red
//        System.out.println(seeColor("xxred"));      // (empty)
//        System.out.println(seeColor("blueTimes"));

   // }
   public static int countCode(String str) {
       if (str == null || str.length() < 4) return 0;
       int count = 0;
       for (int i = 0; i <= str.length() - 4; i++) {
           if (str.charAt(i) == 'c' && str.charAt(i + 1) == 'o' && str.charAt(i + 3) == 'e') {
               count++;
           }
       }
       return count;
   }

    public static void main(String[] args) {
        System.out.println(countCode("aaacodebbb")); // 1
        System.out.println(countCode("codexxcode")); // 2
        System.out.println(countCode("cozexxcope")); // 2
    }
}

