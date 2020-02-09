import java.io.*;

/*
Необходимо написать программу, которая будет выводить на экран текстовые данные из файла .txt
*/
public class Task16{
    public  static  void main(String[] args) {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\user\\Desktop\\text.txt"))) {
            {
                while ((s = br.readLine()) != null) {
                    System.out.println(s);
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Файл не найден " + exc);
        } catch (IOException exc) {
            System.out.println("Ошибка ввода-вывода " + exc);
        }
    }
}