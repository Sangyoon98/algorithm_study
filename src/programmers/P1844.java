package programmers;

import java.util.LinkedList;
import java.util.Queue;

class P1844 {
    public static void main(String[] args) {
        int[][] maps1 = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 1}, {0, 0, 0, 0, 1}};
        int answer1 = 11;
        int result1 = new programmers.P1844().solution(maps1);
        PRINT_RESULT(1, result1, answer1);

        int[][] maps2 = new int[][]{{1, 0, 1, 1, 1}, {1, 0, 1, 0, 1}, {1, 0, 1, 1, 1}, {1, 1, 1, 0, 0}, {0, 0, 0, 0, 1}};
        int answer2 = -1;
        int result2 = new programmers.P1844().solution(maps2);
        PRINT_RESULT(2, result2, answer2);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(int[][] maps) {
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        Queue<int[]> queue = new LinkedList<>();
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        visited[0][0] = true;
        queue.add(new int[] {0, 0});

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            int nowX = now[0];
            int nowY = now[1];

            for (int i = 0; i < 4; i++) {
                int nextX = nowX + dx[i];
                int nextY = nowY + dy[i];

                if (nextX < 0 || nextY < 0 || nextX > maps.length - 1 ||nextY > maps[0].length - 1) continue;
                if (visited[nextX][nextY] || maps[nextX][nextY] == 0) continue;

                queue.add(new int[] {nextX, nextY});
                maps[nextX][nextY] = maps[nowX][nowY] + 1;
                visited[nextX][nextY] = true;
            }
        }

        if (maps[maps.length - 1][maps[0].length - 1] <= 1) return -1;
        else return maps[maps.length - 1][maps[0].length - 1];
    }
}