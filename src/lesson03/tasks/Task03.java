package lesson03.tasks;

/**
 *      Перепишите программы (1 и 2) с использованием цикла while.
 *
 */

public class Task03 {
    public static void main(String[] args) {
        mainOfTask031(100);
        mainOfTask032(3);
    }
    public static void mainOfTask031(int n) {
        int nubmers = 1;
        System.out.println("3-1. Используя while вывести на экран нечетные числа от 1 до 99.");

        while (nubmers < n){
            if(nubmers %2 != 0){
                System.out.print(nubmers + " ");
            }
            nubmers ++;
        }
        System.out.println();
    }
    public static void mainOfTask032(int n) {
        long factorial = 1;
        int i = 1;
        while(i<=n) {
            factorial = factorial * i;
            i++;
        }
        System.out.println("3-2. Дано число n, используя while посчитать факториал n!.");
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
