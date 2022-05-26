public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour < 0) {
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void main(String[] args) {
        long printConversion = toMilesPerHour(25.42);
        System.out.println(printConversion);
    }
}
