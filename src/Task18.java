/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt,
а потом в этот же файл перезаписывать текстовые данные, введенные вручную.
Количество строк после перезаписи должно быть столько же, сколько и в изначальном варианте.
 */
import java.io.*;

public class Task18 {
    public static void main(String[] args) {
        String s;
        String str;
        int count = 0;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\text2.txt"))) {
            while ((s = br.readLine()) != null) {
                System.out.println(s);
                count++;
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден " + exc);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);
        }
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Заменим строки в файле на новые");
        try (FileWriter fw = new FileWriter("C:\\Users\\user\\Desktop\\text2.txt")) {
            for (int i = 0; i < count; i++){
                System.out.println("Осталось заменить строк: " + (count - i));
                str = br.readLine();
                str = str + "\r\n";
                fw.write(str);
            }
            System.out.println("Все строки были заменены");
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода " + ex);
        }
    }
}