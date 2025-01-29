package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181858 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{0, 1, 1, 2, 2, 3};
        int k1 = 3;
        int[] answer1 = new int[]{0, 1, 2};
        int[] result1 = new programmers.P181858().solution(arr1, k1);
        PRINT_RESULT(1, result1, answer1);

        int[] arr2 = new int[]{0, 1, 1, 1, 1};
        int k2 = 4;
        int[] answer2 = new int[]{0, 1, -1, -1};
        int[] result2 = new programmers.P181858().solution(arr2, k2);
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

    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        int[] answer = new int[k];

        for (int i : arr) {
            if (!list.contains(i)) list.add(i);
        }

        for (int i = 0; i < k; i++) {
            if (list.size() > i) answer[i] = list.get(i);
            else answer[i] = -1;
        }

        return answer;
    }
}