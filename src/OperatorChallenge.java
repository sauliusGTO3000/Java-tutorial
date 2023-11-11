public class OperatorChallenge {
    public static void main(String[] args) {
        double twenty = 20.00d;
        double eighty = 80.00d;
        double sum = (twenty + eighty) * 100.00d;
        double remainder = sum % 40.00d;

        boolean isRemainder = remainder == 0.00d ? true : false;

        System.out.println(isRemainder);

        if (!isRemainder){
            System.out.println("Got some remainder!");
        }
    }
}
