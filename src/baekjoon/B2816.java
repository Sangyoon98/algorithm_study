package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2816 {
    public static String[] channel;
    public static int current = 0;
    public static int N;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        channel = new String[N];

        for (int i = 0; i < N; i++) channel[i] = br.readLine();

        while (!channel[current].equals("KBS1")) downChannel();
        while (current > 0) swapUpChannel();

        while (!channel[current].equals("KBS2")) downChannel();
        while (current > 1) swapUpChannel();

        System.out.println(sb);
        System.out.print(Arrays.toString(channel));
    }

    public static void downChannel() {
        if (current < N) {
            current++;
            sb.append("1");
        }
    }

    public static void upChannel() {
        if (current > 0) {
            current--;
            sb.append("2");
        }
    }

    public static void swapDownChannel() {
        if (current < N) {
            swapChannel(current, current + 1);
            current++;
            sb.append("3");
        }
    }

    public static void swapUpChannel() {
        if (current > 0) {
            swapChannel(current, current - 1);
            current--;
            sb.append("4");
        }
    }

    public static void swapChannel(int a, int b) {
        String temp = channel[a];
        channel[a] = channel[b];
        channel[b] = temp;
    }
}