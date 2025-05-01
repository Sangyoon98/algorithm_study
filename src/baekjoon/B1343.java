package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1343 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String answer = br.readLine().replace("XXXX", "AAAA").replace("XX", "BB");
        System.out.print(answer.contains("X") ? -1 : answer);
    }
}
