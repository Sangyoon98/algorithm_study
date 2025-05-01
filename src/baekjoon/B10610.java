package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B10610 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String N = br.readLine();
        int[] arr = new int[N.length()];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = N.charAt(i) - '0';
        }

        Arrays.sort(arr);
        int sum = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            sum += arr[i];
            sb.append(arr[i]);
        }

        if (sum % 3 != 0 || arr[0] != 0) {
            System.out.print(-1);
            return;
        }

        System.out.print(sb);
    }
}
