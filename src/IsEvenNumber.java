public class IsEvenNumber {
    public static void main(String[] args) {
        int number = 5;
        int finishingNumber = 20;
        int totalOdd = 0;
        int totalEven = 0;

        while (number <= finishingNumber && totalEven < 5) {
            if (isEvenNumber(number)) {
                System.out.println(number);
                totalEven++;
            } else {
                totalOdd++;
            }
            number++;
        }

        System.out.println("total odd number is: " + totalOdd);
        System.out.println("total even number is: " + totalEven);
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
