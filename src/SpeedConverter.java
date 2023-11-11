public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        return (kilometersPerHour < 0) ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        long milesPerHour = toMilesPerHour(kilometersPerHour);

        System.out.println(
                milesPerHour == -1 ? "Invalid Value" : kilometersPerHour + " km/h = " + milesPerHour +" mi/h"
        );
    }
}