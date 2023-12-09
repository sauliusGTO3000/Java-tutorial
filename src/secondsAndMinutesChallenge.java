public class secondsAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-3945));
        System.out.println(getDurationString(-65, 45));
        System.out.println(getDurationString(65,145));
    }
    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return  "seconds should be greater than zero!";
        }
        int minutes = seconds / 60;
        int remainderSeconds = seconds % 60;

        return getDurationString(minutes, remainderSeconds);
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0) {
            return "minutes should be greater than zero!";
        }

        if (seconds <= 0 || seconds >= 59) {
            return "seconds should be between 0 and 59!";
        }

        int hours = minutes / 60;

        int remainingMinutes = minutes % 60;

        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
