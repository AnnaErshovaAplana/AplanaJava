/*
Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран,
 где каждый элемент массива умножается на 2. Размер массива задается пользователем.
 */

import  java.util.Scanner;
public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
// Создаем массив и заполняем значениями
        System.out.println("Укажите длину массива: ");
        int arrLength = in.nextInt();
        int arr[] = new int[arrLength];
        int i = 0;
        while (i < arrLength) {
            for (int elem = 0; elem < arr.length; elem ++)
            {
                System.out.println("Введите " + (elem + 1) + "-e число для массива: ");
                arr[i] = in.nextInt();
                i++;
            }
        }
// Выводим элементы массива, умноженные на 2
        System.out.println("Удвоенные элементы массива");
        for (int j = 0; j < arr.length; j++)
        {
            int doubledArrItem = arr[j] * 2;
            System.out.print("|" + doubledArrItem);
        }
        System.out.print("|");
    }
}


