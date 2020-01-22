/*
Необходимо провести сравнение длины двух строк, которые были введены с клавиатуры и записаны в соответствующие переменные.
Вывести на экран строку с наибольшей длиной. Если длины равны, вывести соответствтующее сообщение.
 */

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        if (str1.length() > str2.length()) {
            System.out.print("Строка \"" + str1 + "\" имеет наибольшую длину");
        } else if (str2.length() > str1.length()) {
            System.out.print("Строка \"" + str2 + "\" имеет наибольшую длину");
        } else {
            System.out.print("Введенные строки имеют одинаковую длину");
        }
    }
}
