package lesson03.tasks;

/***
 *      Перепишите программы (1 и 2) с использованием цикла do - while.
 */


public class Task04 {
    public static void main(String[] args) {
        mainOfTask041(100);
        mainOfTask042(5);
    }

    public static void mainOfTask041(int n) {
        int nubmers = 1;
        System.out.println("4-1. Используя do while вывести на экран нечетные числа от 1 до 99.");

        do{
            if(nubmers %2 != 0){
                System.out.print(nubmers + " ");
            }
            nubmers ++;
        } while (nubmers < n);
        System.out.println();
    }

    public static void mainOfTask042(int n) {
        long factorial = 1;
        int i = 1;
        do{
            factorial = factorial * i;
            i++;
        } while(i<=n);
        System.out.println("4-2. Дано число n, используя do while посчитать факториал n!.");
        System.out.println("Factorial of " + n + " is " + factorial);
    }
}
