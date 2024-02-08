import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите строку 1:");
        String str1 = input.next();
        System.out.println("Введите строку 2:");
        String str2 = input.next();
        if (str1.equals(str2)) System.out.println("Строки идентичны");
        else System.out.println("Строки неидентичны");
    }
}
