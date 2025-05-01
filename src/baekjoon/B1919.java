package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1919 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str1 = br.readLine().toCharArray();
        char[] str2 = br.readLine().toCharArray();
        int[] alpha = new int[26];
        for (char ch : str1) alpha[ch - 97]++;
        for (char ch : str2) alpha[ch - 97]--;
        int answer = 0;
        for (int j : alpha) if (j != 0) answer += Math.abs(j);
        System.out.print(answer);
    }
}