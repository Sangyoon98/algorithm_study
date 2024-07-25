package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] str = br.readLine().toCharArray();

        int result = 1;

        for (int i = 0; i < str.length; i++) {
            if (str[i] != str[(str.length - 1) - i]) {
                result = 0;
                break;
            }
        }

        System.out.println(result);
    }
}