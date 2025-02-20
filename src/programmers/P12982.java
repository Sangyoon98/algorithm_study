package programmers;

import java.util.Arrays;

class P12982 {
    public static void main(String[] args) {
        int[] d1 = new int[]{1, 3, 2, 5, 4};
        int budget1 = 9;
        int answer1 = 3;
        int result1 = new programmers.P12982().solution(d1, budget1);
        PRINT_RESULT(1, result1, answer1);

        int[] d2 = new int[]{2, 2, 3, 3};
        int budget2 = 10;
        int answer2 = 4;
        int result2 = new programmers.P12982().solution(d2, budget2);
        PRINT_RESULT(2, result2, answer2);
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

    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);

        for (int i : d) {
            if (budget - i < 0) break;
            budget -= i;
            answer++;
        }

        return answer;
    }
}