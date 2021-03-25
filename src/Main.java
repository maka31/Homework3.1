import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        double[] array = {1.6, -8.3, -6.7, -2.9, -8.2, -6.4, 5.8, -5.3, 8.4, -1.9};

        double sum = 0;
        double number = 0;
        boolean isFirstNegativeNumber = false;

        for (double x : array) {
            if (x < 0) {
                isFirstNegativeNumber = true;
            } else if (x > 0 && isFirstNegativeNumber) {
                sum = sum + x;
                number = number + 1;
            }
        }
        System.out.println(sum / number);
        System.out.println("--------------------------------------------------------");

        bubbleSort(array);
    }

    public static void bubbleSort(double[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }
}
