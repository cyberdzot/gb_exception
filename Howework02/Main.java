package Howework02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // task #1
        System.out.println(testFloat());

        // task #2
        fixCode1(0);
        fixCode1(1);

        // task #3
        fixCode2();
    }

    private static float testFloat() {
        // сканнер в какой то поздней версии Java вроде как сам закрывается...
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                String input = sc.nextLine();
                return Float.parseFloat(input);
            } catch (NumberFormatException e) {
                System.out.println("Ошибка, попробуйте ещё раз...");
            }
        }
    }

    private static void fixCode1(int d) {
        // здесь обойдёмся без try-catch
        if (d == 0) {
            System.out.println("Деление на 0 не возможно!");
            return;
        }
        int[] intArray = new int[9];
        System.out.println(intArray[8] / d);
    }

    private static void fixCode2() {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);

            printSum(23, 234);

            int[] abc = { 1, 2 };
            abc[3] = 9;

        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }
    }

    public static void printSum(int a, int b) {
        System.out.println(a + b);
    }
}
