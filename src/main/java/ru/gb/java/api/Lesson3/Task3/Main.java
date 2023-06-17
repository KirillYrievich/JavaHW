package ru.gb.java.api.Lesson3.Task3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Task3 book1 = new Task3("Книга1", "Сидорова", 500.0, 2009, 500);
        Task3 book2 = new Task3("Книга2", "Иванов", 1000.0, 2020, 400);
        Task3 book3 = new Task3("Книга3", "Петров", 999.0, 2021, 300);
        Task3 book4 = new Task3("Книга4", "Анатольев", 1200.0, 2015, 200);
        List<Task3> listbooks = new ArrayList<>();
        listbooks.add(book1);
        listbooks.add(book2);
        listbooks.add(book3);
        listbooks.add(book4);


        for (int i = 0; i < listbooks.size(); i++) {
            Task3 book = listbooks.get(i);
            int k = 3;
            int page = book.getPages();
            String bookName = "Не удовлетворяет условиям поиска";

            if ((book.getPages() <= 2) && (book.getYear() > 2010) && (book.getAuthor().contains("а"))) {
                bookName = book.getTitle();
            }

            if ((book.getPages() > 2) && (book.getYear() > 2010) && (book.getAuthor().contains("а"))) {
                while (k < page) {
                    if (page % k != 0) {
                        bookName = book.getTitle();
                    } else {
                        break;
                    }
                    k += 2;
                }
            }
            System.out.println(bookName);
        }
    }
}