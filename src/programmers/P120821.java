package programmers;

import java.util.Arrays;

class P120821 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{1, 2, 3, 4, 5};
        int[] answer1 = new int[]{5, 4, 3, 2, 1};
        int[] result1 = new programmers.P120821().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{1, 1, 1, 1, 1, 2};
        int[] answer2 = new int[]{2, 1, 1, 1, 1, 1};
        int[] result2 = new programmers.P120821().solution(num_list2);
        PRINT_RESULT(2, result2, answer2);

        int[] num_list3 = new int[]{1, 0, 1, 1, 1, 3, 5};
        int[] answer3 = new int[]{5, 3, 1, 1, 1, 0, 1};
        int[] result3 = new programmers.P120821().solution(num_list3);
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

    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        for (int i = 0; i < num_list.length; i++)
            answer[num_list.length - 1 - i] = num_list[i];
        return answer;
    }
}