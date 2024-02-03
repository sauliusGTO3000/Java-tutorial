public class getEvenDigitSum {
    public static void main(String[] args) {
        getEvenDigitSum(252);
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }

        int evenSum = 0;

        while (number / 10 >= 0 && number != 0) {
            int digit = number % 10;

            if (digit % 2 == 0) {
                evenSum += digit;
            }

            number = number / 10;
        }

        return evenSum;
    }
}
