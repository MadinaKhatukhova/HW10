import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double number = 0;
        int[] arr = new int[1]; {
        System.out.printf("Сумма трат за месяц составила %.0f рублей.", number);

            Arrays.sort(arr);
            System.out.printf("Минимальная сумма трат за день составила %d рублей.", arr[0]);
            System.out.printf("Максимальная сумма трат за день составила %d рублей.", arr[arr.length - 1]);

            //Задача 3

            double number1 = 199;
            double averageSum = number1 / arr.length - 1;
            System.out.printf("Средняя сумма трат за месяц составила %.2f рублей", averageSum);
    }}}



