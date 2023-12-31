public class AreaCalculator {
    public static void main(String[] args) {
        System.out.println(area(2.3));
    }
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return  3.141592653589793238462643383279502884197  * (radius * radius);
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0;
        }
        return  x * y;
    }
}
