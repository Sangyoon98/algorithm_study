package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1032 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] arr = new String[N];

        for (int i = 0; i < N; i++) arr[i] = br.readLine();

        if (N == 1) System.out.println(arr[0]);
        else {
            for (int i = 0; i < arr[0].length(); i++) {
                boolean isDiff = false;
                for (int j = 1; j < arr.length; j++) {
                    if (arr[j - 1].charAt(i) != arr[j].charAt(i)) {
                        isDiff = true;
                        break;
                    }
                }

                if (isDiff) sb.append("?");
                else sb.append(arr[0].charAt(i));
            }
        }

        System.out.println(sb);
    }
}