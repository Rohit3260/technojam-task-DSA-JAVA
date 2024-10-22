import java.util.Scanner;

public class Q3_BitWar {
    public static long rangeBitwiseMax(long left, long right) {
        long result = left;
        for (long i = left + 1; i <= right; i++) {
            result &= i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long left = scanner.nextLong();

        long right = scanner.nextLong();

        long result = rangeBitwiseMax(left, right);

        System.out.println(result);

        scanner.close();
    }
}