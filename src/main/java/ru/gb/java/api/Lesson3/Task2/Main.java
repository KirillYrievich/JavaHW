package ru.gb.java.api.Lesson3.Task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Task2 goods1 = new Task2("Яблоко", "Россия", 1000, 300.0, 2);
        Task2 goods2 = new Task2("Бананы", "Африка", 1800, 200.0, 2);
        Task2 goods3 = new Task2("Арбузы", "Россия", 120, 300.0, 2);
        Task2 goods4 = new Task2("Ананасы", "Тайланд", 80, 400.2, 2);
        Task2 goods5 = new Task2("Сливы", "Россия", 80, 400.2, 2);
        List<Task2> listgoods = new ArrayList<>();
        listgoods.add(goods1);
        listgoods.add(goods2);
        listgoods.add(goods3);
        listgoods.add(goods4);
        listgoods.add(goods5);

        System.out.println("Input the number of kind: ");
        Scanner scanner = new Scanner(System.in);
        Integer userKind = scanner.nextInt();
        double minVol = goods1.getPrice();
        scanner.close();

        for (int i = 0; i < listgoods.size(); i++) {
            Task2 goods = listgoods.get(i);
            if (goods.getKind() == userKind) {
                if (goods.getPrice() < minVol) {
                    minVol = goods.getPrice();
                }
            } else {
                minVol = -1;
            }
        }

        for (int i = 0; i < listgoods.size(); i++) {
            Task2 goods = listgoods.get(i);
            if (goods.getPrice() == minVol) {
                System.out.print(goods.getName() + " ");
            }
        }
    }
}
