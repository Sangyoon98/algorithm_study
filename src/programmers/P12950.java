package programmers;

import java.util.Arrays;

class P12950 {
    public static void main(String[] args) {
        int[][] arr11 = {{1, 2}, {2, 3}};
        int[][] arr12 = {{3, 4}, {5, 6}};
        int[][] answer1 = {{4, 6}, {7, 9}};
        int[][] result1 = new P12950().solution(arr11, arr12);
        PRINT_RESULT(1, result1, answer1);

        int[][] arr21 = {{1}, {2}};
        int[][] arr22 = {{3}, {4}};
        int[][] answer2 = {{4}, {6}};
        int[][] result2 = new P12950().solution(arr21, arr22);
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
        int[][] answer = new int[arr1.length][arr1[0].length];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}