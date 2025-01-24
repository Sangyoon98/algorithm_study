package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2822 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int[] score = new int[8];
        int[] result = new int[5];
        int sum = 0;

        for (int i = 0; i < score.length; i++) {
            score[i] = Integer.parseInt(br.readLine());
        }

        int[] temp = Arrays.copyOf(score, 8);
        Arrays.sort(temp);
        System.arraycopy(temp, 3, result, 0, temp.length - 3);

        for (int i : result) sum += i;
        sb.append(sum).append("\n");

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < score.length; j++) {
                if (result[i] == score[j]) {
                    result[i] = j + 1;
                    break;
                }
            }
        }

        Arrays.sort(result);
        for (int i : result) sb.append(i).append(" ");

        System.out.print(sb);
    }
}
