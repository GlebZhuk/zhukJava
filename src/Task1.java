import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        boolean run = true;

        while (run) {
            System.out.println("Введите число a:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                a = input.nextInt();
                run = false;
            } else {
                System.out.println("Некорректный ввод");
            }
        }
        run = true;

        while (run) {
            System.out.println("Введите число b:");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                b = input.nextInt();
                run = false;
            } else {
                System.out.println("Некорректный ввод");
            }
        }

        run = true;
        while (run) {
            System.out.println("Выберите действие:");
            System.out.println("1-сравнение");
            System.out.println("2-сложение");
            System.out.println("3-вычитание");
            System.out.println("4-деление");
            System.out.println("5-умножение");
            Scanner input = new Scanner(System.in);
            if (input.hasNextInt()) {
                int c = input.nextInt();
                run = false;
                switch (c) {
                    case 1: {
                        if (a > b) System.out.println("a>b");
                        else if (a < b) System.out.println("a<b");
                        else System.out.println("a=b");
                    }
                    break;
                    case 2:
                        System.out.println(a + b);
                        break;
                    case 3:
                        System.out.println(a - b);
                        break;
                    case 4:
                        if (b != 0) {
                            System.out.println(a / b);
                            break;
                        } else System.out.println("На ноль делить нельзя");
                        break;
                    case 5:
                        System.out.println(a * b);
                        break;
                }
            } else System.out.println("Некорректный ввод");

        }
    }
}
