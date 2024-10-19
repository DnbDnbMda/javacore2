package chapter01.task04;

public class SolutionTask04 {
    public void printMinMaxDouble() {
        double minPositive = Math.nextUp(Double.MIN_VALUE);
        double maxPositive = Math.nextUp(Double.MAX_VALUE);
        System.out.println("Минимальное положительное значение double: " + Double.MIN_VALUE);
        System.out.println("Следующее за минимальным положительным значением: " + minPositive);
        System.out.println("Максимальное положительное значение double: " + Double.MAX_VALUE);
        System.out.println("Следующее за максимальным положительным значением: " + maxPositive);
    }
}
