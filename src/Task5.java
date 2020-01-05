/* Необходимо вывести на экран таблицу умножения от 1 до 10 для введённого пользователем любого числа.
Использовать циклы запрещено.
 */

import java.util.Scanner;

public class Task5 {
    public static  void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = in.nextInt();
        System.out.println("Таблица умножения от 1 до 10 с Вашим числом " + number + ":");
        System.out.print(number * 1 + " ");
        System.out.println(number * 2);
        System.out.print(number * 3 + " ");
        System.out.println(number * 4);
        System.out.print(number * 5 + " ");
        System.out.println(number * 6);
        System.out.print(number * 7 + " ");
        System.out.println(number * 8);
        System.out.print(number * 9 + " ");
        System.out.println(number * 10);
    }
}
