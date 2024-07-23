package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B25304 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long x = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        long total = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            long a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            total += a * b;
        }

        if (total == x) System.out.println("Yes");
        else System.out.println("No");
    }
}
