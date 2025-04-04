package programmers;

import java.util.Arrays;

class P12949 {
    public static void main(String[] args) {
        int[][] arr11 = new int[][]{{1, 4}, {3, 2}, {4, 1}};
        int[][] arr21 = new int[][]{{3, 3}, {3, 3}};
        int[][] answer1 = new int[][]{{15, 15}, {15, 15}, {15, 15}};
        int[][] result1 = new programmers.P12949().solution(arr11, arr21);
        PRINT_RESULT(1, result1, answer1);

        int[][] arr12 = new int[][]{{2, 3, 2}, {4, 2, 4}, {3, 1, 4}};
        int[][] arr22 = new int[][]{{5, 4, 3}, {2, 4, 1}, {3, 1, 1}};
        int[][] answer2 = new int[][]{{22, 22, 11}, {36, 28, 18}, {29, 20, 14}};
        int[][] result2 = new programmers.P12949().solution(arr12, arr22);
        PRINT_RESULT(2, result2, answer2);
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

    public int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[0].length; j++) {
                for (int k = 0; k < arr2.length; k++) {
                    answer[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }
        return answer;
    }
}