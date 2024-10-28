package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181861 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{5, 1, 4};
        int[] answer1 = new int[]{5, 5, 5, 5, 5, 1, 4, 4, 4, 4};
        int[] result1 = new programmers.P181861().solution(arr1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{6, 6};
        int[] answer2 = new int[]{6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6, 6};
        int[] result2 = new programmers.P181861().solution(arr2);
        PRINT_RESULT(2, result2, answer2);

        int[] arr3 = new int[]{1};
        int[] answer3 = new int[]{1};
        int[] result3 = new programmers.P181861().solution(arr3);
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

    public int[] solution(int[] arr) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++)
                answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
    }
}