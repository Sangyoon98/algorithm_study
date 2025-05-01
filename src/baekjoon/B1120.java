package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1120 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String A = st.nextToken();
        String B = st.nextToken();
        int diff = B.length();

        for (int i = 0; i <= B.length() - A.length(); i++) {
            int count = 0;
            for (int j = 0; j < A.length(); j++) {
                if (B.charAt(i + j) != A.charAt(j)) count++;
            }
            diff = Math.min(diff, count);
        }

        System.out.print(diff);
    }
}