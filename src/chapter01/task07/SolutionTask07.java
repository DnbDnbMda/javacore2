package chapter01.task07;

import java.util.Scanner;

public class SolutionTask07 {

    public void calculateResult() {
        short[] inputShort = readDataFromConsole();
        short a = inputShort[0];
        short b = inputShort[1];
        System.out.println("a+b = " + (short) (a + b));
        System.out.println("a-b = " + (short) (a - b));
        System.out.println("a*b = " + (short) (a * b));
        try {
            System.out.println("a/b = " + (short) (a / b));
            System.out.println("a%b = " + (short) (a % b));
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль запрещено");
        }
    }

    public short[] readDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        short[] result = new short[2];
        printMenu(count);
        while (scanner.hasNextLine()) {

            String inputWord = scanner.nextLine();
            if (inputWord.equals("Q") || inputWord.equals("q")) {
                scanner.close();
                System.out.println("Программа завершена!");
                System.exit(1);
            }
            try {
                inputInt = Integer.parseInt(inputWord);
            } catch (NumberFormatException e) {
                System.out.println(inputWord + " введенно некорректное число");
                printMenu(count);
                continue;
            }
            if (inputInt < 0) {
                System.out.println(inputWord + " введенно отрицательное число");
                printMenu(count);
                continue;
            }
            result[count] = (short) inputInt;
            printMenu(++count);
            if (count > 1) break;
        }
        return result;
    }

    public static void printMenu(int count) {
        switch (count) {
            case 0:
                System.out.println("Для выхода введите q / Q");
                System.out.print("Введите первое целое число от 0 до 65535: ");
                break;
            case 1:
                System.out.print("Введите второй целое число: от 0 до 65535: ");
                break;
        }
    }
}
