package programmers;

import java.util.Arrays;

class P120923 {
    public static void main(String[] args) {
        int num1 = 3;
        int total1 = 12;
        int[] answer1 = new int[]{3, 4, 5};
        int[] result1 = new programmers.P120923().solution(num1, total1);
        PRINT_RESULT(1, result1, answer1);

        int num2 = 5;
        int total2 = 15;
        int[] answer2 = new int[]{1, 2, 3, 4, 5};
        int[] result2 = new programmers.P120923().solution(num2, total2);
        PRINT_RESULT(2, result2, answer2);

        int num3 = 4;
        int total3 = 14;
        int[] answer3 = new int[]{2, 3, 4, 5};
        int[] result3 = new programmers.P120923().solution(num3, total3);
        PRINT_RESULT(3, result3, answer3);

        int num4 = 5;
        int total4 = 5;
        int[] answer4 = new int[]{-1, 0, 1, 2, 3};
        int[] result4 = new programmers.P120923().solution(num4, total4);
        PRINT_RESULT(4, result4, answer4);
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

    public int[] solution(int num, int total) {
        int[] answer = new int[num];

        for (int i = -(total + num); i <= (total + num); i++) {
            int sum = 0;
            int index = 0;
            answer = new int[num];

            for (int j = i; j < (i + num); j++) {
                sum += j;
                answer[index++] = j;
            }

            if (sum == total) break;
        }
        return answer;
    }
}