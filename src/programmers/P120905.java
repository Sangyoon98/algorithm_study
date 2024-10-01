package programmers;

import java.util.ArrayList;
import java.util.Arrays;

class P120905 {
    public static void main(String[] args) {
        int n1 = 3;
        int[] numlist1 = new int[]{4, 5, 6, 7, 8, 9, 10, 11, 12};
        int[] answer1 = new int[]{6, 9, 12};
        int[] result1 = new programmers.P120905().solution(n1, numlist1);
        PRINT_RESULT(1, result1, answer1);

        int n2 = 5;
        int[] numlist2 = new int[]{1, 9, 3, 10, 13, 5};
        int[] answer2 = new int[]{10, 5};
        int[] result2 = new programmers.P120905().solution(n2, numlist2);
        PRINT_RESULT(2, result2, answer2);

        int n3 = 12;
        int[] numlist3 = new int[]{2, 100, 120, 600, 12, 12};
        int[] answer3 = new int[]{120, 600, 12, 12};
        int[] result3 = new programmers.P120905().solution(n3, numlist3);
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

    public int[] solution(int n, int[] numlist) {
        ArrayList<Integer> answer = new ArrayList<>();
        for (int i : numlist) {
            if (i % n == 0) answer.add(i);
        }
        return answer.stream().mapToInt(i -> i).toArray();
        // return Arrays.stream(numlist).filter(i -> i % n == 0).toArray();
    }
}