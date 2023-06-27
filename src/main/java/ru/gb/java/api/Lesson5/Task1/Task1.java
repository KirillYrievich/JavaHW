package ru.gb.java.api.Lesson5.Task1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        myCounter();
    }

    public static void myCounter() {
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        text = text.replaceAll("[-|–|—]|\\p{Punct}", " ");
        while (text.contains("  ")) {
            text = text.replace("  ", " ");
        }

        String findWord = "Россия";

        String[] arrayText = text.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String currentWord : arrayText) {
            if (!findWord.toLowerCase().equals(currentWord.toLowerCase())) {
                continue;
            }

            int count = map.getOrDefault(findWord.toLowerCase(), 0);
            map.put(currentWord.toLowerCase(), ++count);
        }

        System.out.println("Запрос: " + findWord);
        System.out.println("Количество искомого слова: " + map.getOrDefault(findWord.toLowerCase(), 0));
    }
}