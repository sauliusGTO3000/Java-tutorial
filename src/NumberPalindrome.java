public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(123));
    }

    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int positiveNumber = number < 0 ? -number : number;

        int remainder = positiveNumber;

        while (remainder > 0) {
            int lastDigit = remainder % 10;
            reversedNumber = (reversedNumber * 10) + lastDigit;
            remainder = remainder / 10;

        }
        reversedNumber += remainder * 10;

        return reversedNumber == positiveNumber;
    }
}
