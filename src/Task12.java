/*
Для введенной с клавиатуры строки необходимо провести отсев пробелов.
Результат в виде строки без пробелов вывести на экран.
 */
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст строки и нажмите enter: ");
        String strWithSpaces = in.nextLine();
        String[] strWithNoSpaces = strWithSpaces.split(" ");
        System.out.println("Введенная строка без пробелов: ");
        for (String word : strWithNoSpaces) {
            System.out.print(word);
        }
    }
}

// Вариант 2 (не удалось решить, т.к. не смогла найти, каким образом можно указать замену на символ, который отсутствует.
//ПОДСКАЖИ,ПОЖАЛУЙСТА,КАК МОЖНО РЕШИТЬ ЭТО. спасибо!
//public class Task12 {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Введите текст строки и нажмите enter: ");
//        String strWithSpaces =  in.nextLine();
//        char[] strWithNoSpaces = strWithSpaces.toCharArray();
//        for (int i = 0; i < strWithNoSpaces.length; i++) {
//            if (strWithNoSpaces[i] == ' ') {
//            }
//            strWithNoSpaces[i] = '';
//        }
//    }
//}
