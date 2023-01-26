import java.lang.reflect.Array;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void displayMainMenu(){
        String[] list_menu = new String[]{
                "1.Показать список зверей в питомнике",
                "2.Показать домашних животных",
                "3.Показать вьючных животных",
                "4.Показать общее количество животных в питомнике",
                "5.Добавить новое животное в питомник",
                "6.Удалить животное из питомника по ID",
                "7.Показать список команд для животного с ID",
                "8.Добавить команду животному с ID",
                "9.Удалить команду у животного с ID",
                "0.Выход из программы"
        };
        for (String el:list_menu) {
            System.out.println(el);
        }
    }
}
