package programmers;

import java.util.Arrays;
import java.util.Stack;

class P181860 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{3, 2, 4, 1, 3};
        boolean[] flag1 = new boolean[]{true, false, true, false, false};
        int[] answer1 = new int[]{3, 3, 3, 3, 4, 4, 4, 4};
        int[] result1 = new programmers.P181860().solution(arr1, flag1);
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

    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> answer = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (flag[i]) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    answer.push(arr[i]);
                }
            } else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.pop();
                }
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}