package chapter01.task03;

import java.util.Scanner;

public class SolutionTask03 {

    public void getMaxNumber(int[] arrayInt) {
        int max ;
        int a = arrayInt[0];
        int b = arrayInt[1];
        int c = arrayInt[2];
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else max = c;

        int maxAb = Math.max(a, b);
        int max2 = Math.max(maxAb, c);

        System.out.println("Вариант решения через условие: " + max);
        System.out.println("Вариант решения используя метод Math.max(): " + max2);
    }

    public int[] readDataFromConsole() {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        int inputInt = 0;
        int[] result = new int[3];
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
                System.out.println(inputWord + " введенное значение не является числом");
                printMenu(count);
                continue;
            }
            result[count] = inputInt;
            printMenu(++count);
            if (count > 2) break;
        }
        return result;
    }

    public static void printMenu(int count) {
        switch (count) {
            case 0:
                System.out.println("Для выхода введите q / Q");
                System.out.print("Введите первое целое число: ");
                break;
            case 1:
                System.out.print("Введите второй целое число: ");
                break;
            case 2:
                System.out.print("Введите третье целое число: ");
                break;
        }
    }
}
