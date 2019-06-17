package com.epam.stream27.taskone;

import java.util.Scanner;

/**
 * Вариант А. Задание 1.
 * В каждом слове текста k-ю букву заменить заданным символом. Если  k больше длины слова, корректировку не выполнять.
 */

public class ReplaceSymbol {

    public static void main(String[] args) {

        String str;
        int k;
        char symbol = '^';

        Scanner scanner = new Scanner(System.in);
        MethodForReplace methodForReplace = new MethodForReplace();
        System.out.println("Enter your text:");
        str = scanner.nextLine();
        System.out.println("Enter a position to replace the character:");
        k = scanner.nextInt();
        System.out.println(methodForReplace.replaceSymbol(str, k, symbol));
    }
}
