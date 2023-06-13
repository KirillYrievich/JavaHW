package ru.gb.java.api.Lesson2;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Сумма = " + sumEl(sum));
    }

    private static int sumEl(int sum) {
        int amount_el = 0;
        int list_el = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите количество элементов: ");
        amount_el = scanner.nextInt();

        System.out.println("Введите элементы: ");

        for (int i = 1; i <= amount_el; i++) {
            list_el = scanner.nextInt();
            sum += list_el;
            if (list_el > 0) {
                for (int j = 2; j <= Math.sqrt(list_el); j++) {
                    if (list_el % j == 0) {
                        sum -= list_el;
                        break;
                    }
                }
            } else {
                sum -= list_el;
            }
        }
        return sum;
    }
}
