package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1806 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int S = Integer.parseInt(st.nextToken());
        int[] arr = new int[N + 1];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = 0;
        int sum = 0;
        int answer = Integer.MAX_VALUE;

        while (start <= end && end <= N) {
            if (sum < S) {
                sum += arr[end++];
            } else {
                answer = Math.min(answer, end - start);
                sum -= arr[start++];
            }
        }

        System.out.print(answer == Integer.MAX_VALUE ? 0 : answer);
    }
}