package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class B24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());

        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) A[i] = Integer.parseInt(st.nextToken());

        int[] B = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i <N; i++) B[i] = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(br.readLine());

        int[] C = new int[M];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < M; i++) C[i] = Integer.parseInt(st.nextToken());

        Deque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            if (A[i] == 0) {
                queue.addFirst(B[i]);
            }
        }

        for (int i = 0; i < M; i++) {
            queue.add(C[i]);
            sb.append(queue.pollFirst()).append(" ");
        }

        System.out.println(sb);
    }
}
