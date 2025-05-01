package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2644 {
    static int n;
    static int[][] graph;
    static int[] visited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int p1 = Integer.parseInt(st.nextToken());
        int p2 = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(br.readLine());
        graph = new int[n + 1][n + 1];
        visited = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            graph[x][y] = graph[y][x] = 1;
        }

        dfs(p1, p2);
        System.out.print(visited[p2] == 0 ? -1 : visited[p2]);
    }

    public static void dfs(int start, int end) {
        if (start == end) return;

        for (int i = 0; i <= n; i++) {
            if (graph[start][i] == 1 && visited[i] == 0) {
                visited[i] = visited[start] + 1;
                dfs(i, end);
            }
        }
    }
}
