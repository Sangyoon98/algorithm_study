package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P12935 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{4, 3, 2, 1};
        int[] answer1 = new int[]{4, 3, 2};
        int[] result1 = new programmers.P12935().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{10};
        int[] answer2 = new int[]{-1};
        int[] result2 = new programmers.P12935().solution(arr2);
        PRINT_RESULT(2, result2, answer2);
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

    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        int min = arr[0];

        if (arr.length == 1) return new int[] {-1};

        for (int i : arr) min = Math.min(min, i);

        for (int i : arr) {
            if (min != i) answer.add(i);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}