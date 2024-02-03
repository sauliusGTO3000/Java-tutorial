public class ParseInt {
    public static void main(String[] args) {
        int currentYear = 2024;
        String userDateOfBirth = "1990";

        int parsedUserDateOfBirth = Integer.parseInt(userDateOfBirth);

        System.out.println("User age is: " + (currentYear - parsedUserDateOfBirth));
    }
}
