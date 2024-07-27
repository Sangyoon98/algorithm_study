package baekjoon;

import java.io.*;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            int[] arr = new int[4];

            for (int j = 0; j < coins.length; j++) {
                arr[j] = C / coins[j];
                C %= coins[j];
            }

            for (int cnt : arr) {
                result.append(cnt).append(" ");
            }
            result.append("\n");
        }

        System.out.print(result);
    }
}
