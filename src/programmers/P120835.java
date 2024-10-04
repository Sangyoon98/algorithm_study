package programmers;

import java.util.Arrays;

class P120835 {
    public static void main(String[] args) {
        int[] emergency1 = new int[]{3, 76, 24};
        int[] answer1 = new int[]{3, 1, 2};
        int[] result1 = new programmers.P120835().solution(emergency1);
        PRINT_RESULT(1, result1, answer1);

        int[] emergency2 = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] answer2 = new int[]{7, 6, 5, 4, 3, 2, 1};
        int[] result2 = new programmers.P120835().solution(emergency2);
        PRINT_RESULT(2, result2, answer2);

        int[] emergency3 = new int[]{30, 10, 23, 6, 100};
        int[] answer3 = new int[]{2, 4, 3, 5, 1};
        int[] result3 = new programmers.P120835().solution(emergency3);
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

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i < emergency.length; i++) {
            for (int j = 0; j < emergency.length; j++) {
                if (emergency[i] < emergency[j]) answer[i]++;
            }
            answer[i]++;
        }
        return answer;
    }
}