package programmers;

import java.util.Arrays;

class P181899 {
    public static void main(String[] args) {
        int start_num1 = 10;
        int end_num1 = 3;
        int[] answer1 = new int[]{10, 9, 8, 7, 6, 5, 4, 3};
        int[] result1 = new programmers.P181899().solution(start_num1, end_num1);
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

    public int[] solution(int start_num, int end_num) {
        int[] answer = new int[start_num - end_num + 1];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = start_num - i;
        }
        return answer;
    }
}