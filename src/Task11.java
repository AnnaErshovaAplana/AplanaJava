/*
Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную.
Результат вывести на экран.
 */
import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       System.out.println("Введите текст строки и нажмите enter: ");
       String str = in.nextLine();
       System.out.println("Строка, которую Вы ввели, записана в переменную str и содержит текст:" + str);
    }
}
