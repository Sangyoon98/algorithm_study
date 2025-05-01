package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B13305 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] road = new int[N - 1];
        int[] price = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < road.length; i++) road[i] = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < price.length; i++) price[i] = Integer.parseInt(st.nextToken());

        long sum = 0;
        long minCost = price[0];

        for (int i = 0; i < N - 1; i++) {
            if (price[i] < minCost) minCost = price[i];
            sum += (minCost * road[i]);
        }

        System.out.println(sum);
    }
}