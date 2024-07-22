package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        StringTokenizer numList = new StringTokenizer(br.readLine());
        int v = Integer.parseInt(br.readLine());

        int result = 0;

        while(numList.hasMoreElements()) {
            if (v == Integer.parseInt(numList.nextToken())) {
                result++;
            }
        }

        System.out.println(result);
    }
}
