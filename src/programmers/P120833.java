package programmers;

import java.util.Arrays;

class P120833 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, 3, 4, 5};
        int num11 = 1;
        int num21 = 3;
        int[] answer1 = new int[]{2, 3, 4};
        int[] result1 = new programmers.P120833().solution(numbers1, num11, num21);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{1, 3, 5};
        int num12 = 1;
        int num22 = 2;
        int[] answer2 = new int[]{3, 5};
        int[] result2 = new programmers.P120833().solution(numbers2, num12, num22);
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

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2 - num1 + 1];
        for (int i = 0; i < answer.length; i++)
            answer[i] = numbers[num1 + i];
        return answer;
        // return Arrays.copyOfRange(numbers, num1, num2 + 1);
    }
}