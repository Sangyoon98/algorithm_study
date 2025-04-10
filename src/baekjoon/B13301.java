package baekjoon;

import java.util.Scanner;

public class B13301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        long[] dp = new long[81];

        dp[1] = 4;
        dp[2] = 6;

        for (int i = 3; i <= N; i++) {
            dp[i] = dp[i - 2] + dp[i - 1];
        }

        System.out.print(dp[N]);
    }
}