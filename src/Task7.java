/*
Необходимо написать программу, где бы пользователю предлагалось ввести с клавиатуры число в переменную number.
В программе должны присутствовать константы X, Y, Z.
Программа должна сравнивать введенное значение с клавиатуры со значением констант и
вывести на экран сообщение "Данное значение имеется в константах" если number=X или Y или Z.
Если переменная отличается от констант, нужно вывести оповещение "Такой константы нет!"
 */
import java.util.Scanner;

//// Вариант 1
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();
        final int X = 20;
        final int Y = 30;
        final int Z = 50;
        if (number == X || number == Y || number == Z) {
            System.out.println("Данное значение имеется в константах");
        }
        else {
            System.out.println("Такой константы нет!");
        }
    }
}

// Вариант 2
public class Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число:");
        int number = in.nextInt();
        final int X = 20;
        final int Y = 30;
        final int Z = 50;
        switch (number) {
            case X:
            case Y:
            case Z:
                System.out.println("Данное значение имеется в константах");
                break;
            default:
                System.out.println("Такой константы нет!");
                break;
        }
    }
}

