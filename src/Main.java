import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//Задача 1
        double sum = 0;
        for (int j : arr) {
            sum += j;
        }
        System.out.printf("Сумма трат за месяц составила %.0f рублей.\n", sum);
//Задача 2
        Arrays.sort(arr);
        System.out.printf("Минимальная сумма трат за день составила %d рублей.\n", arr[0]);
        System.out.printf("Максимальная сумма трат за день составила %d рублей.\n", arr[arr.length - 1]);

//Задача 3

        double average = sum / arr.length - 1;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", average);

//Задача 4

        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int c = reverseFullName.length - 1; c >= 0; c--) {
            System.out.print(reverseFullName[c] + " ");
        }
    }

    static int[] arr = generateRandomArray();

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}