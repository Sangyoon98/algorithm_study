package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] N = br.readLine().split("");
        int[] number = new int[10];

        for (String s : N) number[Integer.parseInt(s)]++;

        if ((number[6] + number[9]) % 2 == 0) {
            number[6] = number[9] = (number[6] + number[9]) / 2;
        } else number[6] = number[9] = (number[6] + number[9]) / 2 + 1;

        int answer = 0;
        for (int num : number) {
            if (answer < num) answer = num;
        }

        System.out.print(answer);
    }
}