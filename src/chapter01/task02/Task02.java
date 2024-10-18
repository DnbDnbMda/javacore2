package chapter01.task02;

import java.util.Scanner;

public class Task02 {
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
                continue;
            }

            int normalDegrees = ((inputInt % 360 + 360) % 360);
            int normalDegrees2 = Math.floorMod(inputInt, 360);
            System.out.println("Вариант решения используя оператор %: " + normalDegrees);
            System.out.println("Вариант решения используя оператор метод floorMod: " + normalDegrees2);

            printMenu();
        }
        System.exit(1);
    }

    public static void printMenu() {
        System.out.println("Для выхода введите q / Q");
        System.out.println("Введите количество градусов для нормализации:");
    }

}
