package programmers;

class P87946 {
    public static void main(String[] args) {
        int k1 = 80;
        int[][] dungeons1 = new int[][]{{80, 20}, {50, 40}, {30, 10}};
        int answer1 = 3;
        int result1 = new programmers.P87946().solution(k1, dungeons1);
        PRINT_RESULT(1, result1, answer1);
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

    static boolean[] visited;
    static int answer = -1;

    public int solution(int k, int[][] dungeons) {
        visited = new boolean[dungeons.length];
        dfs(k, dungeons, 0);
        return answer;
    }

    public void dfs(int k, int[][] dungeons, int count) {
        answer = Math.max(answer, count);

        for (int i = 0; i < dungeons.length; i++) {
            if (!visited[i] && dungeons[i][0] <= k) {
                visited[i] = true;
                k -= dungeons[i][1];

                dfs(k, dungeons, count + 1);

                visited[i] = false;
                k += dungeons[i][1];
            }
        }
    }
}