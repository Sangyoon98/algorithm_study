package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());

        String[] arrStr = new String[testCase];

        for (int i = 0; i < testCase; i++) {
            arrStr[i] = br.readLine();
        }

        for (String str : arrStr) {
            System.out.println(String.valueOf(str.charAt(0)) + str.charAt(str.length() - 1));
        }
    }
}
