package programmers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class P12906 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 1, 3, 3, 0, 1, 1};
        int[] answer1 = new int[]{1, 3, 0, 1};
        int[] result1 = new P12906().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{4, 4, 4, 3, 3};
        int[] answer2 = new int[]{4, 3};
        int[] result2 = new P12906().solution(num_list2);
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

    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> answer = new ArrayList<>();

        for (int i : arr) {
            if (!stack.isEmpty()) {
                if (stack.peek() != i) {
                    stack.push(i);
                    answer.add(i);
                }
            } else {
                stack.push(i);
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}