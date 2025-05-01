package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1934 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            sb.append((A * B) / getGCD(A, B)).append("\n"); // 최소공배수 = (A * B) / 최대공약수
        }

        System.out.print(sb);
    }

    public static int getGCD(int num1, int num2) {  // 최대공약수
        if (num1 % num2 == 0) return num2;
        return getGCD(num2, num1 % num2);
    }
}
