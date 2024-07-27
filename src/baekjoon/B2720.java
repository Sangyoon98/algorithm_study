package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[] coins = {25, 10, 5, 1};

        for (int i = 0; i < T; i++) {
            int C = Integer.parseInt(br.readLine());
            int[] arr = new int[4];

            for (int coin : coins) {
                arr[i] = C / coin;
                C %= coin;
            }

            for (int cnt : arr) {
                System.out.println(cnt + " ");
            }
        }
    }
}
