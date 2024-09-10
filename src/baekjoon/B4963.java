package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B4963 {
    static int[][] pos = {{0, -1}, {0, 1}, {1, 0}, {-1, 0}, {-1, 1}, {1, 1}, {-1, -1}, {1, -1}};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int w = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());

            if (w == 0 && h == 0) break;
            else {
                int[][] graph = new int[h][w];
                boolean[][] visited = new boolean[h][w];
                int count = 0;

                for (int i = 0; i < h; i++) {
                    st = new StringTokenizer(br.readLine());
                    for (int j = 0; j < w; j++) {
                        graph[i][j] = Integer.parseInt(st.nextToken());
                    }
                }

                for (int i = 0; i < h; i++) {
                    for (int j = 0; j < w; j++) {
                        if (graph[i][j] == 1 && !visited[i][j]) {
                            bfs(i, j, graph, visited, h, w);
                            count++;
                        }
                    }
                }

                System.out.println(count);
            }
        }
    }

    static void bfs(int x, int y, int[][] graph, boolean[][] visited, int h, int w) {
        visited[x][y] = true;
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});

        while (!queue.isEmpty()) {
            int[] arr = queue.poll();
            int nowX = arr[0];
            int nowY = arr[1];

            for (int[] po : pos) {
                int nx = nowX + po[0];
                int ny = nowY + po[1];

                if (nx >= 0 && nx < h && ny >= 0 && ny < w && graph[nx][ny] == 1 && !visited[nx][ny]) {
                    visited[nx][ny] = true;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
    }
}