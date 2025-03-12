package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181893 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 2, 3, 4, 5};
        int[] query1 = new int[]{4, 1, 2};
        int[] answer1 = new int[]{1, 2, 3};
        int[] result1 = new programmers.P181893().solution(arr1, query1);
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

    public int[] solution(int[] arr, int[] query) {
        int start = 0;
        int end = arr.length - 1;

        for (int i = 0; i < query.length; i++) {
            if (i % 2 == 0) {
                end = start + query[i];
            } else {
                start += query[i];
            }
        }

        return Arrays.copyOfRange(arr, start, end + 1);
    }
}