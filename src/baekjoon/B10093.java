package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10093 {
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        if (A > B) number(B, A);
        else if (B > A) number(A, B);
        else System.out.println(0);
    }

    public static void number(long small, long big) {
        sb.append(big - small - 1).append("\n");
        for (long i = small + 1; i < big; i++) {
            sb.append(i).append(" ");
        }
        System.out.println(sb);
    }
}
