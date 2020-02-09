/*
Необходимо написать программу, которая будет реализовывать следующие действия:
        1. Ввод числа с клавиатуры и запись его в строковую переменную S
        2. Конвертация строковой переменной S в числовую переменную X типа int
        3. Конвертация числа X типа int в число Y типа double
        Все три числа разных типов необходимо в столбик вывести на экран
*/

import java.util.Scanner;

public class Task14{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число: ");
        // Ввод числа с клавиатуры и запись его в строковую переменную S
        String s = in.nextLine();
        // Конвертация строковой переменной S в числовую переменную X типа int
        int x = Integer.parseInt(s);
        // Конвертация числа X типа int в число Y типа double
        double y = (double) x;
        // V2 int x = Integer.valueOf(s);
        System.out.println("Строковая переменная S:" + s);
        System.out.println("Числовая переменная типа int X: " + x);
        System.out.println("Числовая переменная типа double Y: " + y);
    }
}