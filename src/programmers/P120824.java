package programmers;

import java.util.Arrays;

class P120824 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 2, 3, 4, 5};
        int[] answer1 = new int[]{2, 3};
        int[] result1 = new programmers.P120824().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{1, 3, 5, 7};
        int[] answer2 = new int[]{0, 4};
        int[] result2 = new programmers.P120824().solution(num_list2);
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

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];
        for (int i : num_list) {
            if (i % 2 == 0) answer[0]++;
            else answer[1]++;
        }
        return answer;
    }
}