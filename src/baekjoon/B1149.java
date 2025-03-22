package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1149 {
    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;
    static int[][] arr, dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N][3];
        dp = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][RED] = Integer.parseInt(st.nextToken());
            arr[i][GREEN] = Integer.parseInt(st.nextToken());
            arr[i][BLUE] = Integer.parseInt(st.nextToken());
        }

        dp[0][RED] = arr[0][RED];
        dp[0][GREEN] = arr[0][GREEN];
        dp[0][BLUE] = arr[0][BLUE];

        System.out.print(Math.min(cost(N - 1, RED), Math.min(cost(N - 1, GREEN), cost(N - 1, BLUE))));
    }

    static int cost(int N, int color) {
        if (dp[N][color] == 0) {
            if (color == RED) dp[N][RED] = Math.min(cost(N - 1, GREEN), cost(N - 1,  BLUE)) + arr[N][RED];
            else if (color == GREEN) dp[N][GREEN] = Math.min(cost(N - 1, RED), cost(N - 1, BLUE)) + arr[N][GREEN];
            else dp[N][BLUE] = Math.min(cost(N - 1, RED), cost(N - 1, GREEN)) + arr[N][BLUE];
        }
        return dp[N][color];
    }
}