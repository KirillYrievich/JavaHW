package ru.gb.java.api.lesson6;

import java.util.*;

public class Main {

    public static int userInput(String msg){
        Scanner sc = new Scanner(System.in);
        int inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = Integer.parseInt(sc.next());
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }
    public static String userSInput(String msg){
        Scanner sc = new Scanner(System.in);
        String inputStr;
        while (true){
            System.out.println(msg);
            try{
                inputStr = sc.nextLine();
                break;
            } catch (NumberFormatException e){
                System.out.println("Неверный ввод!");
            }
        }
        return inputStr;
    }


    public static void main(String[] args) {
        Task6 MSI1 = new Task6("MSI", "8", "256", "None", "Black");
        Task6 Huawei1 = new Task6("Huawei","8", "256", "Linux", "Black");
        Task6 Asus1 = new Task6("Asus","8", "256", "Windows 10", "White");
        Task6 Apple1 = new Task6("Apple", "8", "256", "Mac OS", "Red");
        Task6 Honor1 = new Task6("Honor", "16", "512", "Windows XP", "Grey");
        Task6 MSI2 = new Task6("MSI", "16", "1024", "Windows XP", "Black");

        ArrayList<Task6> laptops = new ArrayList<>();
        laptops.add(MSI1);
        laptops.add(Honor1);
        laptops.add(Huawei1);
        laptops.add(Apple1);
        laptops.add(Asus1);
        laptops.add(MSI2);

        int numPoisk = userInput("Выберите критерии параметры сортировки:\n 1 - сортировка по производителю, \n 2 - сортировка по оперативной памяти," +
                " \n 3 - сортировка по размеру SSD, \n 4 - сортировка по операционной системе, \n 5 - сортировка по цвету, \n 6 - показать весь список ");

        if (numPoisk == 6){
            for (Task6 laptop: laptops) {
                laptop.printInfo();
                System.out.println();
            }
        }

        else if (numPoisk == 1){
            String numParametr = userSInput("Напишите интресующий бренд");
            for (Task6 brand : laptops) {
                if (brand.getBrand().equalsIgnoreCase(numParametr)) {
                    System.out.println(brand.printInfo());
                }
            }
        }

        else if (numPoisk == 2){
            String numParametr = userSInput("Напишите размер ram: ");
            for (Task6 ram : laptops) {
                if (ram.getRam().equalsIgnoreCase(numParametr)) {
                    System.out.println(ram.printInfo());
                }
            }
        }

        else if (numPoisk == 3){
            String numParametr = userSInput("Напишите размер SSD: ");
            for (Task6 ssd : laptops) {
                if (ssd.getSSD().equalsIgnoreCase(numParametr)) {
                    System.out.println(ssd.printInfo());
                }
            }
        }

        else if (numPoisk == 4){
            String numParametr = userSInput("Напишите интересующую операционную систему: ");
            for (Task6 os : laptops) {
                if (os.getOs().equalsIgnoreCase(numParametr)) {
                    System.out.println(os.printInfo());
                }
            }
        }

        else if (numPoisk == 5){
            String numParametr = userSInput("Напишите интересующий цвет: ");
            for (Task6 color : laptops) {
                if (color.getColor().equalsIgnoreCase(numParametr)) {
                    System.out.println(color.printInfo());
                }
            }
        }
    }
}
