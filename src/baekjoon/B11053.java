package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11053 {
    static int[] seq;
    static Integer[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        seq = new int[N];
        dp = new Integer[N];

        for (int i = 0; i < N; i++) seq[i] = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) dp(i);

        int max = dp[0];

        for (int i = 0; i < N; i++) max = Math.max(max, dp[i]);

        System.out.print(max);
    }

    public static int dp(int N) {
        if (dp[N] == null) {
            dp[N] = 1;

            for (int i = N - 1; i >= 0; i--) {
                if (seq[i] < seq[N]) {
                    dp[N] = Math.max(dp[N], dp(i) + 1);
                }
            }
        }
        return dp[N];
    }
}
