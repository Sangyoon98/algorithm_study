package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class B2501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> num = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                num.add(i);
            }
        }

        Collections.sort(num);
        if (num.size() < K) System.out.println("0");
        else System.out.println(num.get(K - 1));
    }
}