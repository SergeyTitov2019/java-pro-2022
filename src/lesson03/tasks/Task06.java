package lesson03.tasks;


import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        getNumber();
    }
    public static void getNumber(){
        int sequence[] =  new int [10];
        int add = 0;
        System.out.println("6. Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        for (int i = 0; i < sequence.length; i++) {
                sequence[i] = i + add;
                add -= 6;
            System.out.print(sequence[i] + ", ");
        }
    }
}
