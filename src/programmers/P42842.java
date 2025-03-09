package programmers;

import java.util.Arrays;

class P42842 {
    public static void main(String[] args) {
        int brown1 = 10;
        int yellow1 = 2;
        int[] answer1 = new int[]{4, 3};
        int[] result1 = new programmers.P42842().solution(brown1, yellow1);
        PRINT_RESULT(1, result1, answer1);

        int brown2 = 8;
        int yellow2 = 1;
        int[] answer2 = new int[]{3, 3};
        int[] result2 = new programmers.P42842().solution(brown2, yellow2);
        PRINT_RESULT(2, result2, answer2);

        int brown3 = 24;
        int yellow3 = 24;
        int[] answer3 = new int[]{8, 6};
        int[] result3 = new programmers.P42842().solution(brown3, yellow3);
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

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for (int i = 3; i <= 5000; i++) {
            int a = (brown + yellow) / i;

            if ((i - 2) * (a - 2) == yellow) {
                answer[0] = a;
                answer[1] = i;
                break;
            }
        }

        return answer;
    }
}