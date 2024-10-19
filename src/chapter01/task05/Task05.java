package chapter01.task05;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputInt = 0;
        printMenu();
        while (scanner.hasNext()) {
            String word = scanner.next();
            if (word.equals("Q") || word.equals("q")) {
                scanner.close();
                break;
            }
            try {
                inputInt = Integer.parseInt(word);
            } catch (NumberFormatException e) {
                System.out.println(word + " введенное значение не является числом");
                printMenu();
                scanner.next();
            }

            String binStr = Integer.toString(inputInt, 2);
            String hexStr = Integer.toHexString(inputInt);
            String eightStr = Integer.toString(inputInt, 8);
            System.out.println("Двоичное представление: " + binStr);
            System.out.println("Восьмеричное представление: " + eightStr);
            System.out.println("Шестнадцатиричное представление: " + hexStr);
            if (inputInt != 0) {
                double reverseDouble = 1.0 / inputInt;
                String reverseStr = Double.toHexString(reverseDouble);
                System.out.println("Шестнадцатеричное представление обратного числа с плавующей точкой: " + reverseStr);
            } else {
                System.out.println("Введеное значение ноль. Невозможно вычислить обратное значение введеного числа.");
            }
            printMenu();
        }
        System.exit(1);
    }

    public static void printMenu() {
        System.out.println("Для выхода введите q / Q");
        System.out.println("Введите число:");
    }
}
