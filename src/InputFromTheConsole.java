import java.util.Scanner;
public class InputFromTheConsole {
    public static void main(String[] args) {
        try {
            System.out.println(getInputFromConsole());
        } catch (NullPointerException e) {
            System.out.println(getInputFromScanner());
        }
    }

    public static String getInputFromConsole() {
//        this method will not run with InteliJ IDEA, and throw NullPointerException because its runner is blocking console, use terminal instead "java src/InputFromTheconsole.java"
        String name = System.console().readLine("Please type in your name.");
        System.out.println("hello, " + name);

        String dateOfBirth = System.console().readLine("What is your birth year?");
        int age = 2024 - Integer.parseInt(dateOfBirth);

        return "Thanks, you are " + age + " years old";
    }

    public static String getInputFromScanner() {
        Scanner scanner = new Scanner(System.in);
//        String name = System.console().readLine("Please type in your name.");
        System.out.println("Hi, what's your name?");
        String name = scanner.nextLine();
        boolean validDob = false;
        int age = 0;

        do {
            System.out.println("What year you were born, " + name + "?");
            try {
                String dateOfBirth = scanner.nextLine();
                age = checkDob(2024, dateOfBirth);
                validDob = age > 0;
            } catch (NumberFormatException e) {
                System.out.println("please enter date of birth in number format");
            }
        } while (!validDob);


        return "Thanks, you are " + age + " years old";
    }

    public static int checkDob(int currentYear, String dateOfBirth) {
        int dob = Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if (dob < minimumYear || dob > currentYear) {
            return -1;
        }

        return (currentYear - dob);

    }
}
