/*
1. Ввод трех чисел с клавиатуры x, y, z
2. Нахождение и вывод на экран среднего арифметического чисел x, y, z
3. Деление среднего арифметического на 2 без остатка
4. Если полученное число больше 3, то вывести на экран сообщение "Программа выполнена корректно"
 */

import  java.util.Scanner;
public class Task6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1-ое число:");
        int x = in.nextInt();
        System.out.println("Введите 2-ое число:");
        int y = in.nextInt();
        System.out.println("Введите 3-ое число:");
        int z = in.nextInt();
        double avg = (x + y + z) / 3.0;
        System.out.println("Среднее арифметическое: " + avg);
        int ravg;
        ravg = (int) avg / 2;
        if (ravg > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
