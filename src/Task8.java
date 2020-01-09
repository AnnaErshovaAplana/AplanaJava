/*
Необходимо с помощью цикла вывести на экран числа от 1 до 50.
*/

//Вариант 1
public class Task8 {
    public static void main (String[] args) {
        int x = 1;
        while (x < 50) {
            System.out.print(x + " ");
            x++;
        }
    }
}
// Вариант 2
public class Task8 {
    public static void main (String[] args) {
        for (int i = 1; i < 50; i++) {
            System.out.print(i + " ");
        }
    }
}

// Вариант 3
public class Task8 {
    public static void main(String[] args) {
        int x = 1;
        do {
            System.out.print(x + " ");
        }
        while (x++ < 50);
    }
}