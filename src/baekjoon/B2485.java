package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;

        for (int i = 0; i < N - 1; i++) {
            int distance = arr[i + 1] - arr[i];
            gcd = getGCD(distance, gcd);
        }

        System.out.println((arr[N - 1] - arr[0]) / gcd + 1 - (arr.length));
    }

    public static int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
