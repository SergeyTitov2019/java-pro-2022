package lesson03.tasks;

public class Task07 {
    public static void main(String[] args) {
        getMultiplication(5);
    }

    public static void getMultiplication(int n) {
        System.out.println("7. Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        for(int i = 1; i < 10; i++){
            for(int k = 5; k <= n; k++){
                System.out.print(i +" x "+ "5 " + "= " + k * i);
            }
            System.out.println("");
        }
    }
}
