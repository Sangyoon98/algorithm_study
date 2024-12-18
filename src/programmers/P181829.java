package programmers;

class P181829 {
    public static void main(String[] args) {
        int[][] board1 = new int[][]{{0, 1, 2}, {1, 2, 3}, {2, 3, 4}, {3, 4, 5}};
        int k1 = 2;
        int answer1 = 8;
        int result1 = new programmers.P181829().solution(board1, k1);
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

    public int solution(int[][] board, int k) {
        int answer = 0;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (i + j <= k) answer += board[i][j];
            }
        }
        return answer;
    }
}