public class Main {
public static void main(String[] args) {
    //Задача 1

    double sum = 0;
    int[] arr = new int[0];
    for (int j : arr) {
        sum += j;
    }
    System.out.printf("Сумма трат за месяц составила %.0f рублей.", sum);

    //Задача 2
    int[] array = {2, 6, 5, 3};
    int min = array[0];
    for (int i = 1; i < array.length; i++) {
        System.out.println(" Минимальная сумма трат за день составила " + min + " рубля");
        int max = array[0];
        for (;i < array.length; i++) {
        if (max < array[i]) {
            max = array[i];
            System.out.println("Максимальная сумма трат за день составила " + max + " рублей");

    //Задача 2

}}}}}