package chapter01.task08;

import java.util.Arrays;
import java.util.Scanner;

public class SolutionTask08 {

    public void getResultTask() {
        Scanner scanner = new Scanner(System.in);
        String inputWord;
        printMenu();
        while (scanner.hasNextLine()) {
            inputWord = scanner.nextLine();
            if (inputWord.equals("Q") || inputWord.equals("q")) {
                scanner.close();
                System.out.println("Программа завершена!");
                System.exit(1);
            }
            System.out.println(Arrays.toString(inputWord.split("\\s+")));
            printMenu();
        }
    }

    public static void printMenu() {
        System.out.println("Для выхода введите q / Q");
        System.out.print("Введите строку: ");
    }
}

