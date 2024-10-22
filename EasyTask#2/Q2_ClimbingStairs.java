import java.util.Scanner;

public class Q2_ClimbingStairs {
    public static long climbStairs(long n) {
        // Base cases
        if (n < 3)
            return n;

        long forSecondLast = 1; // Ways to climb 1 stair
        long forLastStair = 2; // Ways to climb 2 stairs
        long stairsClimbed = 0;

        // Start from the 3rd stair to the nth stair
        for (long i = 3; i <= n; ++i) {
            stairsClimbed = forLastStair + forSecondLast;
            forSecondLast = forLastStair;
            forLastStair = stairsClimbed;
        }

        return stairsClimbed;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        System.out.println(climbStairs(n));
        sc.close();
    }
}
