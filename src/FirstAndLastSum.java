public class FirstAndLastSum {
    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(5));
        System.out.println(sumFirstAndLastDigit(433));
        System.out.println(sumFirstAndLastDigit(543535430));
        System.out.println(sumFirstAndLastDigit(5));

    }

    public static int sumFirstAndLastDigit(int number) {
        if (number < 0) {
            return -1;
        }

        int lastNumber = number % 10;
        int firstNumber = number;

        while (firstNumber / 10 > 0) {
            firstNumber = firstNumber / 10;
        }

        return lastNumber + firstNumber;
    }
}
