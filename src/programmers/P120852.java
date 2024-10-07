package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P120852 {
    public static void main(String[] args) {
        int n1 = 12;
        int[] answer1 = new int[]{2, 3};
        int[] result1 = new programmers.P120852().solution(n1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 17;
        int[] answer2 = new int[]{17};
        int[] result2 = new programmers.P120852().solution(n2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 420;
        int[] answer3 = new int[]{2, 3, 5, 7};
        int[] result3 = new programmers.P120852().solution(n3);
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

    public int[] solution(int n) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!answer.contains(i)) answer.add(i);
                n /= i;
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}