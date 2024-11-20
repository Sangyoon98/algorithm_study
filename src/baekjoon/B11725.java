package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B11725 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] answer = new int[N + 1];
        ArrayList<Integer>[] node = new ArrayList[N + 1];
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N + 1];

        for (int i = 1; i <= N; i++) node[i] = new ArrayList<>();

        for (int i = 1; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            node[a].add(b);
            node[b].add(a);
        }

        queue.add(1);
        visited[1] = true;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int next : node[current]) {
                if (visited[next]) continue;
                queue.add(next);
                visited[next] = true;
                answer[next] = current;
            }
        }

        for (int i = 2; i <= N; i++) System.out.println(answer[i]);
    }
}