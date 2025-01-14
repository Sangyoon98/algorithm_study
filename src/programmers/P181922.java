package programmers;

import java.util.Arrays;

class P181922 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 4, 3};
        int[][] queries1 = new int[][]{{0, 4, 1}, {0, 3, 2}, {0, 3, 3}};
        int[] answer1 = new int[]{3, 2, 4, 6, 4};
        int[] result1 = new programmers.P181922().solution(arr1, queries1);
        PRINT_RESULT(1, result1, answer1);
    }

    public static void PRINT_RESULT(int index, int[] result, int[] answer) {
        boolean correct = Arrays.equals(result, answer);
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(Arrays.toString(result)).append("\n");
        sb.append("\t- 기댓값: \t").append(Arrays.toString(answer)).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                if (i % query[2] == 0) arr[i]++;
            }
        }
        return arr;
    }
}