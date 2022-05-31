package lesson03.tasks;

/**
 *       2. Дано число n при помощи цикла for посчитать факториал n!.
 */

public class Task02 {
    public static void main(String[] args) {
    }

    public static void task02GetFactorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        System.out.println("2. Дано число n при помощи цикла for посчитать факториал n!.");
        System.out.println("Factorial of " + n + " is " + result);
    }
}
