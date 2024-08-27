package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1267 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int Y = 0;
        int M = 0;

        for (int i = 0; i < N; i++) {
            int call = Integer.parseInt(st.nextToken());
            Y += calculate(call, 30, 10);
            M += calculate(call, 60,  15);
        }

        if (Y > M) System.out.println("M " + M);
        else if (Y < M) System.out.println("Y " + Y);
        else System.out.println("Y M " + Y);
    }

    public static int calculate(int call, int sec, int won) {
        if (call % sec >= 0) return ((call / sec) + 1) * won;
        else return (call / sec) * won;
    }
}