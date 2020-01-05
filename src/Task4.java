/*
Ввести с консоли число в бинарном формате.
Перевести его в десятичный формат, записать в переменную int и вывести на экран.
*/
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число в бинарном формате: ");
        String binary = in.nextLine();
        System.out.println("Ваше число в бинарном формате: " + binary);
        int dec = Integer.parseInt(binary, 2);
        System.out.println("Ваше число в десятичном формате: " + dec);
    }
}
