package ru.gb.java.api.Lesson2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int list_el;
        int list_el_next;
        int amount_el;
        boolean seq = true;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        amount_el = scanner.nextInt();

        System.out.println("Введите элементы: ");
        list_el = scanner.nextInt();

        for (int i = 1; i < amount_el; i++) {
            list_el_next = scanner.nextInt();
            if (list_el > list_el_next) {
                seq = false;
            }
            list_el = list_el_next;
        }

        if (seq == true) {
            System.out.println("Последовательность является возрастающей.");
        } else {
            System.out.println("Последовательность является не возрастающей.");
        }
    }
}
