package programmers;

import java.util.Arrays;

class P120862 {
    public static void main(String[] args) {
        int[] numbers1 = new int[]{1, 2, -3, 4, -5};
        int answer1 = 15;
        int result1 = new programmers.P120862().solution(numbers1);
        PRINT_RESULT(1, result1, answer1);

        int[] numbers2 = new int[]{0, -31, 24, 10, 1, 9};
        int answer2 = 240;
        int result2 = new programmers.P120862().solution(numbers2);
        PRINT_RESULT(2, result2, answer2);

        int[] numbers3 = new int[]{10, 20, 30, 5, 5, 20, 5};
        int answer3 = 600;
        int result3 = new programmers.P120862().solution(numbers3);
        PRINT_RESULT(3, result3, answer3);
    }

    public static void PRINT_RESULT(int index, int result, int answer) {
        boolean correct = result == answer;
        StringBuilder sb = new StringBuilder();
        sb.append("\n\n테스트 케이스 ").append(index).append(": ");
        sb.append(correct ? "정답" : "오답").append("\n");
        sb.append("\t- 실행 결과: \t").append(result).append("\n");
        sb.append("\t- 기댓값: \t").append(answer).append("\n");
        if (correct) System.out.println(sb);
        else throw new RuntimeException(sb.toString());
    }

    public int solution(int[] numbers) {
        Arrays.sort(numbers);
        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}