package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B1260_2 {
    public static int N, M;
    public static int[][] graph;
    public static boolean[] visited;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        graph = new int[N + 1][N + 1];
        visited = new boolean[N + 1];

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        dfs(V);
        sb.append("\n");
        visited = new boolean[N + 1];
        bfs(V);
        System.out.print(sb);
    }

    public static void dfs(int V) { // 깊이 우선 탐색
        visited[V] = true;
        sb.append(V).append(" ");

        for (int i = 0; i <= N; i++) {
            if (graph[V][i] == 1 && !visited[i]) dfs(i);
        }
    }

    public static void bfs(int V) { // 너비 우선 탐색
        Queue<Integer> queue = new LinkedList<>();
        queue.add(V);
        visited[V] = true;

        while (!queue.isEmpty()) {
            V = queue.poll();
            sb.append(V).append(" ");

            for (int i = 1; i <= N; i++) {
                if (graph[V][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
