public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(34));
        System.out.println(getDaysInMonth(5,5));
    }

    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }

        int divisibleByFour = year % 4;
        int divisibleByHundred = year % 100;
        int divisibleByFourHundred = year % 400;

        if ((divisibleByFour == 0 && divisibleByHundred != 0) || divisibleByFourHundred == 0) {
            return true;
        }

        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12) {
            return -1;
        }

        if (year < 1 || year > 9999) {
            return -1;
        }

        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 4, 6, 9, 11 -> 30;
            case 2 -> {
                if (isLeapYear(year)) {
                    yield 29;
                }
                yield 28;
            }
            default -> -1;
        };
    }
}
