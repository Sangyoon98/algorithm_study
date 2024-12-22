package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class P12910 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 9, 7, 10};
        int divisor1 = 5;
        int[] answer1 = new int[]{5, 10};
        int[] result1 = new programmers.P12910().solution(arr1, divisor1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{2, 36, 1, 3};
        int divisor2 = 1;
        int[] answer2 = new int[]{1, 2, 3, 36};
        int[] result2 = new programmers.P12910().solution(arr2, divisor2);
        PRINT_RESULT(2, result2, answer2);

        int[] arr3 = new int[]{3, 2, 6};
        int divisor3 = 10;
        int[] answer3 = new int[]{-1};
        int[] result3 = new programmers.P12910().solution(arr3, divisor3);
        PRINT_RESULT(3, result3, answer3);
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

    public int[] solution(int[] arr, int divisor) {
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            if (i % divisor == 0) answer.add(i);
        }

        Collections.sort(answer);
        if (answer.isEmpty()) answer.add(-1);

        return answer.stream().mapToInt(i -> i).toArray();
    }
}