package ru.gb.java.api.Lesson4.Task2;

public class Main {
    public static void main(String args[]) {
        String str = "()[]{}";

        boolean isValid = Task2.isValid(str);

        System.out.print(isValid);
    }
}