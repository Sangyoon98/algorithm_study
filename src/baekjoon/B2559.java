package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) arr[i] = Integer.parseInt(st.nextToken());

        int start = 0;
        int end = K - 1;
        int sum = 0;

        for (int i = start; i <= end; i++) sum += arr[i];

        int answer = sum;

        while (end < N - 1) {
            sum += arr[++end] - arr[start++];
            answer = Math.max(answer, sum);
        }

        System.out.print(answer);
    }
}