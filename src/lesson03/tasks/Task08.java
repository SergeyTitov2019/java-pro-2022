package lesson03.tasks;

import java.util.Arrays;

public class Task08 {
    public static void main(String[] args) {
        getOdds();
    }

    public static void getOdds() {
        int[] arr = new int[20];

        System.out.println("1.Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        for (int i = 0; i < arr.length; i++) {
            arr[i/2] = i;
        }
        int[] copiedArray = Arrays.copyOf(arr, 10);
        System.out.println("array of odds: " + Arrays.toString(copiedArray));


        System.out.print("odd numbers: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + ", ");
        }

    }
}
