package ru.gb.java.api.Lesson4;

import java.util.LinkedList;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        LinkedList<Integer> integerLinkedList = new LinkedList<>();
        System.out.println("Введите размер списка: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Введите значения списка: ");
        for (int i = 0; i < n; i++) {
            integerLinkedList.add(scanner.nextInt());
        }
        scanner.close();
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(integerLinkedList.get(i));
            System.out.println(' ');
        }
    }
}