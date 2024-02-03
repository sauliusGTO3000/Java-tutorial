public class ThePrimeNumberChallenge {
    private static int counter = 0;

    public static void main(String[] args) {
        int rangeLow = 700;
        int rangeHigh = 777;

        for (int i = rangeLow; (counter < 3 && i <= 1000 && i <= rangeHigh); i++) {
            System.out.println(i + " is " + (isPrime(i) ? "" : "not ") + "a prime number");

        }
        System.out.println(counter);
    }

    public static boolean isPrime(int wholeNumber) {

        if (wholeNumber <= 2) {
            if (wholeNumber != 2) {
                return false;
            };
        }
        for (int divisor = 2; divisor < wholeNumber / 2; divisor++) {
            if (wholeNumber % divisor == 0) {
                return false;
            }
        }
        counter++;
        return true;
    }
}
