package ru.gb.java.api.Lesson3.Task1;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Task1 goods1 = new Task1("Высший Апельсин", 500.0, 2);
        Task1 goods2 = new Task1("Яблоки", 300.0, 1);
        Task1 goods3 = new Task1("Высший Банан", 1000.0, 4);
        Task1 goods4 = new Task1("Высший Ананас", 1500.0, 1);
        Task1 goods5 = new Task1("Высший Арбуз", 1999.0, 1);
        List<Task1> listgoods = new ArrayList<>();
        listgoods.add(goods1);
        listgoods.add(goods2);
        listgoods.add(goods3);
        listgoods.add(goods4);
        listgoods.add(goods5);
        double maxVol = 0.0;

        for (int i = 0; i < listgoods.size(); i++) {
            Task1 goods = listgoods.get(i);
            if ((goods.getKind() <= 2) && (goods.getName().contains("Высший"))) {
                if (goods.getPrice() > maxVol) {
                    maxVol = goods.getPrice();
                }
            }
        }
        System.out.println("Наибольшая цена: " + maxVol);
    }
}
