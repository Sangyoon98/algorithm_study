package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] alphabet = new int[26];

       for (int i = 0; i < s.length(); i++) {
           char c = s.charAt(i);
           alphabet[c - 97]++;
       }

       for (int i : alphabet) {
           System.out.print(i + " ");
       }
    }
}