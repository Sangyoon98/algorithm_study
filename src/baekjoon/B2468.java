package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class B2468 {
    static int N;
    static int[][] map;
    static boolean[][] checked;
    static int[] dx = {1, 0, -1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        map = new int[N][N];
        int maxHeight = 0;

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] > maxHeight) maxHeight = map[i][j];
            }
        }

        int max = 0;

        for (int i = 0; i <= maxHeight; i++) {
            checked = new boolean[N][N];
            int count = 0;

            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N; k++) {
                    if (!checked[j][k] && map[j][k] > i) {
                        count += dfs(j, k, i);
                    }
                }
            }

            max = Math.max(max, count);
        }

        System.out.print(max);
    }

    static int dfs(int x, int y, int height) {
        checked[x][y] = true;

        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) continue;
            if (checked[nx][ny]) continue;
            if (map[nx][ny] > height) dfs(nx, ny, height);
        }

        return 1;
    }

    static int bfs(int x, int y, int height) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {x, y});
        checked[x][y] = true;

        while (!queue.isEmpty()) {
            int[] pos = queue.poll();
            int px = pos[0];
            int py = pos[1];

            for (int i = 0; i < 4; i++) {
                int nx = px + dx[i];
                int ny = py + dy[i];

                if (nx < 0 || ny < 0 || nx > N - 1 || ny > N - 1) continue;
                if (checked[nx][ny]) continue;
                if (map[nx][ny] > height) {
                    checked[nx][ny] = true;
                    queue.add(new int[] {nx, ny});
                }
            }
        }

        return 1;
    }
}
