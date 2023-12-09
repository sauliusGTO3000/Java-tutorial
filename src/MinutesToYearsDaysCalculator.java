public class MinutesToYearsDaysCalculator {
    public static void main(String[] args) {
        printYearsAndDays( (long) 525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }

        long years = (long) minutes / (long) 525600;
        long remainingMinutes = (long) minutes % (long) 525600;
        long days = remainingMinutes / (long) 1440;
        System.out.println(minutes + " min = " + years + " y and " + days + " d");

    }
}
