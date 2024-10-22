import java.util.Scanner;

public class Q1_PascalTriangle {
    public static void generatePascalTriangle(int n) {
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            int ans = 1;
            for (int j = 0; j <= i; j++) {
                System.out.print(ans + " ");

                ans = ans * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        generatePascalTriangle(n);
    }
}
