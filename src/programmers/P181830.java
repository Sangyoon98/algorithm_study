package programmers;

import java.util.Arrays;

class P181830 {
    public static void main(String[] args) {
        int[][] arr1 = new int[][]{{572, 22, 37}, {287, 726, 384}, {85, 137, 292}, {487, 13, 876}};
        int[][] answer1 = new int[][]{{572, 22, 37, 0}, {287, 726, 384, 0}, {85, 137, 292, 0}, {487, 13, 876, 0}};
        int[][] result1 = new programmers.P181830().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[][] arr2 = new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}};
        int[][] answer2 = new int[][]{{57, 192, 534, 2}, {9, 345, 192, 999}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        int[][] result2 = new programmers.P181830().solution(arr2);
        PRINT_RESULT(2, result2, answer2);

        int[][] arr3 = new int[][]{{1, 2}, {3, 4}};
        int[][] answer3 = new int[][]{{1, 2}, {3, 4}};
        int[][] result3 = new programmers.P181830().solution(arr3);
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

    public int[][] solution(int[][] arr) {
        int len = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[len][len];

        for (int i = 0; i < arr.length; i++) {
            System.arraycopy(arr[i], 0, answer[i], 0, arr[i].length);
        }

        return answer;
    }
}