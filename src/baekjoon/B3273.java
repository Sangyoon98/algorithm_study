package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B3273 {
    static int N, X;
    static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++)
            arr[i] = Integer.parseInt(st.nextToken());

        X = Integer.parseInt(br.readLine());

        Arrays.sort(arr);
        int start = 0, end = N -1, answer = 0;

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == X) {
                answer++;
                start++;
                continue;
            } else if (sum < X) start++;
            else end--;
        }

        System.out.print(answer);
    }
}