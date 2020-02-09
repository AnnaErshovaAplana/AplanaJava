/*
Написать программу сортировки по возрастанию заданного пользователем массива чисел.
Использовать пузырьковый метод сортировки.
*/
import java.util.Scanner;

public class Task15{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введите количество символов в массиве: ");
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
        // Сортируем полученный массив методом пузырька
        for (int k = arrLength - 1; k > 0; k--) {
            for (int m = 0; m < k; m++) {
                if (arr[m] > arr[m + 1]) {
                    int tmp = arr[m];
                    arr[m] = arr[m + 1];
                    arr[m + 1] = tmp;
                }
            }
        }

        System.out.println("Отсортированный массив");
        for (int el : arr) {
            System.out.print(el + "\n");
        }
    }
}