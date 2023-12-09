public class methodOverloadChallenge {
    public static void main(String[] args) {
        System.out.println(convertToCentimeters(7));
        System.out.println(convertToCentimeters(6, 7));

    }
    public static double convertToCentimeters(int inches) {
        return inches * 2.54;
    }

    public static double convertToCentimeters(int feet, int inches) {
        return (feet * 30.48) + (inches * 2.54);
    }
}
