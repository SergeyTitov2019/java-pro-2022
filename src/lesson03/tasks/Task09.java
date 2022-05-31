package lesson03.tasks;

import java.util.Arrays;

public class Task09 {
    public static void main(String[] args) {
        System.out.println("9. Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)");
        getMax(10);
    }

    public static void getMax(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int min = Arrays.stream(arr).min().getAsInt();
        int max = Arrays.stream(arr).max().getAsInt();

        System.out.print("Random array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Min value: " + min);
        System.out.println("10. В массиве из задания 9. найти наибольший элемент");

        System.out.println("Max value: " + max);
    }
}
