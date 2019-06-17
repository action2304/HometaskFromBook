package com.epam.stream27.tasktwo;

import java.util.Scanner;

/**
 * Вариант А. Задание 22.
 * Преобразовать текст так, чтобы каждое слово начиналось с заглавной буквы.
 */

public class TransformText {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Boolean up = true;
        for (char c : s.toCharArray()) {
            if (up) {
                c = Character.toUpperCase(c);
                up = false;
            }
            if (c == ' ') {
                up = true;
            }
            System.out.print(c);
        }
    }
}
