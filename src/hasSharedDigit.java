public class hasSharedDigit {
    public static void main(String[] args) {
        hasSharedDigit(74,75);
    }

    public static boolean hasSharedDigit(int num1, int num2) {
        if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
            return false;
        }

        int num1digit1 = num1 / 10;
        int num1digit2 = num1 % 10;
        int num2digit1 = num2 / 10;
        int num2digit2 = num2 % 10;

        if (
                (num1digit1 == num2digit1 || num1digit1 == num2digit2)
                        || (num1digit2 == num2digit1 || num1digit2 == num2digit2)
        ) {

            return true;
        }

        return false;
    }
}
