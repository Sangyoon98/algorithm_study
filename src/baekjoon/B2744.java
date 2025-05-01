package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2744 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringBuilder result = new StringBuilder();

        char[] tmp = s.toCharArray();

        for (char c : tmp) {
            if (c >= 65 && c <= 90) {
                result.append(String.valueOf(c).toLowerCase());
            } else if (c >= 97 && c <= 122) {
                result.append(String.valueOf(c).toUpperCase());
            } else {
                result.append(c);
            }
        }

        System.out.println(result);
    }
}
