package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2606_2 {
    public static int computer, count = 0;
    public static int[][] graph;
    public static boolean[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        computer = Integer.parseInt(br.readLine());
        int line = Integer.parseInt(br.readLine());
        graph = new int[computer + 1][computer + 1];
        visited = new boolean[computer + 1];

        for (int i = 0; i < line; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = graph[b][a] = 1;
        }

        dfs(1);
        System.out.print(count - 1);
    }

    public static void dfs(int start) {
        visited[start] = true;
        count++;

        for (int i = 0; i <= computer; i++) {
            if (graph[start][i] == 1 && !visited[i]) dfs(i);
        }
    }
}