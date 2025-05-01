package baekjoon.prefixSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2851 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;

            if (sum >= 100) {
                if (100 - (sum - n) < sum - 100) System.out.println(sum - n);
                else System.out.println(sum);
                System.exit(0);
            }
        }

        System.out.println(sum);
    }
}