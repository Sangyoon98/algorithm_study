package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11721 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String N = br.readLine();

        while (true) {
            if (N.length() <= 10) {
                System.out.println(N);
                break;
            } else {
                System.out.println(N.substring(0, 10));
                N = N.substring(10);
            }
        }
    }
}