package programmers;

import java.util.Arrays;

class P181927 {
    public static void main(String[] args) {
        int[] num_list1 = new int[]{2, 1, 6};
        int[] answer1 = new int[]{2, 1, 6, 5};
        int[] result1 = new programmers.P181927().solution(num_list1);
        PRINT_RESULT(1, result1, answer1);

        int[] num_list2 = new int[]{5, 2, 1, 7, 5};
        int[] answer2 = new int[]{5, 2, 1, 7, 5, 10};
        int[] result2 = new programmers.P181927().solution(num_list2);
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
        int[] answer = new int[num_list.length + 1];

        for (int i = 0; i < num_list.length; i++) answer[i] = num_list[i];

        if (num_list[num_list.length - 1] > num_list[num_list.length - 2])
            answer[num_list.length] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        else answer[num_list.length] = num_list[num_list.length - 1] * 2;

        return answer;
    }
}