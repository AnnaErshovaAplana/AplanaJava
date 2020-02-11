/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Пользователь программы должен задавать размер массива и наполнять его числами.
Использовать одну из следующих сортировок: прямого выбора, вставки, быстрая, Шелла.
 */

import java.util.Scanner;

public class FinalTask3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество элементов в массиве: ");
        int arrLength = in.nextInt();
        int[] arr = new int[arrLength];
        for (int i = 0; i < arrLength; i++) {
            System.out.println("Введите " + (i + 1) + "е число массива: ");
            int elem = in.nextInt();
            arr[i] = elem;
        }

        System.out.println("Неотсортированный массив");
        for (int elem : arr) {
            System.out.print(elem + "\n");
        }
        // Определяем минимальный элемент неотсортированого массива
        for (int i = 0; i < arrLength; i++) {
            int min = arr[i];
            int index = i;

            for (int j = i + 1; j < arrLength; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    index = j;
                }
            }
            //Перемещаем его  отсортированную часть
            int temp = arr[index];
            arr[index] = min;
            min = temp;

        }
        System.out.println("Отсортированный массив");
        for (int element : arr) {
            System.out.println(element);
        }
    }
}
