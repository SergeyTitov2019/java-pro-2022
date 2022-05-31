package lesson03.tasks;

public class Task12 {
    public static void main(String[] args) {
        System.out.println("12. Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");
        getChess();
    }

    private static void getChess() {
        for (int i = 1; i < 9; i++) {
            for (int k = 1; k < 9; k++) {
                if (i%2 == k%2) {
                    System.out.print("W  ");
                } else {
                    System.out.print("B  ");
                }
            }
            System.out.println("");
        }
    }


}
