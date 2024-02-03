public class Sum3And5 {
    public static void main(String[] args) {
        int sum = 0;
        int count = 0;
        for (int i = 1; count < 5 && i <= 1000; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("number that divides by 3 and 5 is: " + i);
                sum += i;
                count++;
            }
        }

        System.out.println("the sum of all numbers that meet conditions is: " + sum);
    }
}
