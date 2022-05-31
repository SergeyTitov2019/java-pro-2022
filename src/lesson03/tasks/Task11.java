package lesson03.tasks;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        System.out.println("11. Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
        getChange(5);
    }

    public static void getChange(int n) {
        int[] arr = new int[n];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
        }
        int max = Arrays.stream(arr).max().getAsInt();
        int min = Arrays.stream(arr).min().getAsInt();
        System.out.print("Random array: ");
        System.out.println(Arrays.toString(arr));
        System.out.println("Min value: " + min);
        System.out.println("Max value: " + max);

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == max){
                maxInd = i;

            }
            if(arr[i] == min){
                minInd = i;
            }
        }
        int temp = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = temp;

        System.out.print("New array: ");
        System.out.println(Arrays.toString(arr));
    }
}
