package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] number = new int[31];

        for (int i = 1; i <= 28; i++) {
            number[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i <= 30; i++) {
            if (number[i] == 0) {
                System.out.println(i);
            }
        }
    }
}
