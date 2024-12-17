package programmers;

import java.util.Arrays;

class P181833 {
    public static void main(String[] args) {
        int n1 = 3;
        int[][] answer1 = new int[][]{{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int[][] result1 = new programmers.P181833().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 6;
        int[][] answer2 = new int[][]{{1, 0, 0, 0, 0, 0}, {0, 1, 0, 0, 0, 0}, {0, 0, 1, 0, 0, 0}, {0, 0, 0, 1, 0, 0}, {0, 0, 0, 0, 1, 0}, {0, 0, 0, 0, 0, 1}};
        int[][] result2 = new programmers.P181833().solution(n2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 1;
        int[][] answer3 = new int[][]{{1}};
        int[][] result3 = new programmers.P181833().solution(n3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, int[][] result, int[][] answer) {
        boolean correct = Arrays.deepEquals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.deepToString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.deepToString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[][] solution(int n) {
        int[][] answer = new int[n][n];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                if (i == j) answer[i][j] = 1;
                else answer[i][j] = 0;
            }
        }

        return answer;
    }
}