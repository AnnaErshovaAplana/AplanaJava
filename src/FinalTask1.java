/*
Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат, записать в переменную int и вывести на экран.
Необходимо использовать циклы, нельзя использования готовые методы языка Java,
 для перевода числа из одной системы счисления в другую.
 */

import java.util.Scanner;

public class FinalTask1 {
    public  static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите число в бинарном формате:");
        // Записываем в массив введенное число в бинарном формате
        String binaryline = in.nextLine();
        int length = binaryline.length();
        int[] binary = new int[length];
        for (int j = 0; j < length; j++){
            binary[j] = binaryline.charAt(j);
        }
        int dec = 0 ;
        // Переводим в десятичный формат
        for (int i = 0; i < length; i ++) {
            int x =  (int)((binary[i] - 48)*(Math.pow(2,length-i-1)));
            dec = dec + x;
        }
        System.out.println("Введенное Вами число в десятичном формате:" + "\n" + dec);
    }
}