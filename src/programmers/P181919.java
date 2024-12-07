package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P181919 {
    public static void main(String[] args) {
        int n1 = 10;
        int[] answer1 = new int[]{10, 5, 16, 8, 4, 2, 1};
        int[] result1 = new programmers.P181919().solution(n1);
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

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        int x = n;
        answer.add(x);

        while (x != 1) {
            if (x % 2 == 0) x = x / 2;
            else x = 3 * x + 1;
            answer.add(x);
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}