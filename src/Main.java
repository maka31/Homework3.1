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
    }
}
