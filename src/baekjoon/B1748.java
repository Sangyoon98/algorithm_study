package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1748 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int temp = 0;
        int length = 10;

        for (int i = 1; i <= N; i++) {
            if (i == length) {
                count++;
                length *= 10;
            }
            temp += count;
        }

        System.out.print(temp);
    }
}
