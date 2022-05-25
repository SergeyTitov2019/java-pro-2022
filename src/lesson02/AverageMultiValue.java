package lesson02;

public class AverageMultiValue {
    public static void averageOfMany(int[] numbers ) {

        double res = 0;
        if (numbers.length > 0)
        {
            double sum = 0;
            for (int j = 0; j < numbers.length; j++) {
                sum += numbers[j];
            }
            res = sum / numbers.length;
            System.out.println("average of many: " + res);
        }
    }
}
