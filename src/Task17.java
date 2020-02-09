/*
Необходимо написать программу, которая будет записывать текстовые данные, введенные с экрана, в файл .txt.
Запись ввести в файл до тех пор, пока не будет введена команда стоп в консоли.
Пользователь при тестировании программы по правилу черного ящика должен понимать,
какой принцип остановки записи в файл он должен подать.
 */

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task17{
    public  static  void main(String[] args) {
        String s;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца вввода строки - 'стоп'");
        try (FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\text1.txt")){
            do {
                s = br.readLine();
                if (s.compareTo("стоп") == 0) break;
                s = s + "\r\n";
                fw.write(s);
            } while (s.compareTo("стоп") != 0);
        }
        catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);
        }
    }
}