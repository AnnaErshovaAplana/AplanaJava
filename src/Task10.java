import java.util.Scanner;
/*
Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран,
 где каждый элемент умножается на 3. Размерность матрицы задается пользователем.
*/
public class Task10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Создаем матрицу и заполняем значениями
        System.out.println("Укажите количество элементов в строке: ");
        int rowlength = in.nextInt();

        System.out.println("Укажите количество строк: ");
        int rows = in.nextInt();
        int arr[][] = new int[rows][rowlength];

        for (int line = 0; line < rows; line++) {
            for (int rowElement = 0; rowElement < rowlength; rowElement++) {
                System.out.println("Введите " + (rowElement + 1) + "-e число для " + (line + 1) + " строки");
                arr[line][rowElement] = in.nextInt();
            }
        }
        // Выводим элементы массива, умноженные на 3
        System.out.println("Утроенные элементы первой строки матрицы");

        for (int j = 0; j < arr[0].length; j++) {
            int tripledArrItem = arr[0][j] * 3;
            System.out.print("|" + tripledArrItem);
        }

        System.out.print("|");
    }
}
