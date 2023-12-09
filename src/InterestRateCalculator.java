public class InterestRateCalculator {
    public static void main(String[] args) {
        for (double i = 7.5; i <= 10; i += 0.25) {
            System.out.println("100 with interest rate of " + i + " is : " + calculateInterestAmount(100.0, i));
        }
    }

    public static double calculateInterestAmount(double amount, double rate) {
        return amount * (rate / 100.0);
    }
}
