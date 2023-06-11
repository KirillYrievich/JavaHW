
package ru.gb.java.api.lesson1;

public class task1 {
    public static void main(String[] args) {

        String s = "the sky is blue";
        System.out.println("convert(s) = " + convert(s));
    }

    private static String convert(String s) {
        String[] words = (s.trim()).split("\\s+");
        String res = "";
        for (int i = words.length - 1; i >= 0; i--) {
            res += (words[i]);
            if (i > 0) {
                res += " ";
            }
        }
        return res;
    }
}
