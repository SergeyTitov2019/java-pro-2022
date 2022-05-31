package lesson03.tasks;

import java.util.Arrays;

/**
*       1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.
*/

public class Task01 {
    public static void mainOfTask01(int num) {
        int nubmers[] = new int[num];
        System.out.println("1. При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        for (int i = 0; i < nubmers.length; i++) {
            nubmers[i] = i;
            if(nubmers[i]%2 != 0){
                System.out.print(i + " ");
            }
        }
    }
}
