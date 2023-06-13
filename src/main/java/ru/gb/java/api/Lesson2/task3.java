package ru.gb.java.api.Lesson2;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Введите длинну массива: ");
            int size = input.nextInt();
            int array[] = new int[size];
            System.out.println("Введите число:");

            for (int i = 0; i < size; i++) {
                array[i] = input.nextInt();
            }

            System.out.print("Введенный массив:");
            for (int i = 0; i < size; i++) {
                System.out.print(" " + array[i]);
            }
            System.out.println();

            int sumIndexTwoSign = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i] > 9 && array[i] < 100) {
                    sumIndexTwoSign = sumIndexTwoSign + i;
                }
            }
            System.out.println();
            System.out.print("Новый массив: ");
            for (int i = 0; i < array.length; i++) {
                if (array[i] < 0) {
                    array[i] = sumIndexTwoSign;
                }
                System.out.print(array[i] + " ");
            }
        }
    }
}

