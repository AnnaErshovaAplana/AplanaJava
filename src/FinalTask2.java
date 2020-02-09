/*
Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
Пользователь вводит текущий курс и количество рублей.
Итоговое значение должно быть округлено до двух знаков после запятой.
(Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class FinalTask2 {
    public static void main(String[] args) {

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите текущий курс для перевода рубли в доллары:");
            try {
                //String courseString = in.nextLine();
                double course = in.nextDouble();
                System.out.println("Введите количество рублей:");

                double rub = in.nextDouble();
                double dol = (rub / course);

                // Оставляем только 2 знака после запятой.
                int onlyTwosigns = (int) Math.floor(dol * 100);
                double onlyTwo = onlyTwosigns / 100.0;

                System.out.println("Курс доллара: " + course);
                System.out.println("Количество рублей: " + rub);
                System.out.println("Количество долларов с высокой  точностью: " + dol);
                System.out.println("Количество долларов с двумя знаками после запятой: " + onlyTwo);
                break;

            } catch (InputMismatchException exc) {
                System.out.println("Вводите значение с использованием запятой в качестве разделителя\r\n");
            } catch (Exception exc) {
                System.out.println(exc + "\r\n");
            }
        }
    }
}
//(BufferedReader br = new BufferedReader(new InputStreamReader(System.in)))