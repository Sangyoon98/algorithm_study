package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P3059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int[] alphabet = new int[26];
            int sum = 0;
            char[] ch = br.readLine().toCharArray();

            for (char c : ch) alphabet[c - 65]++;

            for (int j = 0; j < alphabet.length; j++)
                if (alphabet[j] == 0) sum += j + 65;

            sb.append(sum).append("\n");
        }

        System.out.print(sb);
    }
}
