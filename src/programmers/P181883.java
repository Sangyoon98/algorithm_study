package programmers;

import java.util.Arrays;

class P181883 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 3, 4};
        int[][] queries1 = new int[][]{{0, 1}, {1, 2}, {2, 3}};
        int[] answer1 = new int[]{1, 3, 4, 4, 4};
        int[] result1 = new programmers.P181883().solution(arr1, queries1);
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
        for (int[] i : queries)
            for (int j = i[0]; j <= i[1]; j++) arr[j]++;
        return arr;
    }
}