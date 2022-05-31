package lesson03.tasks;

public class Task05 {
    public static void main(String[] args) {
        getPower(5, 2);
    }

    public static void getPower(int num, int n) {
        int res = (int) Math.pow(num, n);
        System.out.println("5. Даны переменные x и n вычислить x^n. ");
        System.out.println("pow: " + num + " in " + n + " = " +res );
    }
}
