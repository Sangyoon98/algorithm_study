package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        long[] arr = new long[N];

        for (int i = 0; i < N; i++) arr[i] = Long.parseLong(st.nextToken());

        Arrays.sort(arr);

        int start = 0;
        int end = N - 1;
        long result = Long.MAX_VALUE;
        long L1 = 0;
        long L2 = 0;

        while (end != start) {
            long diff = arr[start] + arr[end];

            if (result > Math.abs(diff)) {
                L1 = arr[start];
                L2 = arr[end];
                result = Math.abs(diff);
            }

            if (diff < 0) start++;
            else if (diff > 0) end--;
            else break;
        }

        System.out.print(L1 + " " + L2);
    }
}